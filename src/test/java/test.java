import com.yu.feiqian.pojo.query;
import com.yu.feiqian.service.LoginServiceImpl;
import com.yu.feiqian.service.QueryStudentServiceImpl;
import com.yu.feiqian.service.QueryStudentSevenServiceImpl;
import com.yu.feiqian.utils.DataUtil;
import com.yu.feiqian.utils.DateUtil;
import com.yu.feiqian.utils.JsonUtil;
import com.yu.feiqian.view.Json;
import com.yu.feiqian.view.Jview;
import com.yu.feiqian.view.LoginView;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class test {
    @Test
    public void Test(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginServiceImpl loginServiceImpl = context.getBean("loginServiceImpl", LoginServiceImpl.class);
        LoginView admin = loginServiceImpl.query(new LoginView("admin", "123456"));
        System.out.println(admin);
    }

    @Test
    public void Test1(){
        String date = DateUtil.getDate();
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        QueryStudentServiceImpl queryStudentServiceImpl = context.getBean("queryStudentServiceImpl", QueryStudentServiceImpl.class);
        Jview jview = queryStudentServiceImpl.queryJCD(date);
        System.out.println(jview);
    }
    @Test
    public void Test2(){

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        long time = date.getTime();
        long dayHm=86400*1000;
        Date date1 = new Date(time - dayHm);
        String format = sdf.format(date1);
        System.out.println(format);
    }
    @Test
    public void test3(){
        ArrayList<String> dates = DateUtil.getDates();
        dates.forEach(s -> System.out.println(s));
    }
    @Test
    public void test4(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        QueryStudentSevenServiceImpl queryStudentSevenServiceImpl = context.getBean("queryStudentSevenServiceImpl", QueryStudentSevenServiceImpl.class);
        ArrayList<String> d = DateUtil.getDates();
        ArrayList<Jview> jviews = queryStudentSevenServiceImpl.queryJZT(new query(d.get(0), d.get(1), d.get(2), d.get(3), d.get(4), d.get(5), d.get(6)));
        ArrayList<Json> data=new ArrayList<>();
        for (int i = 0; i < jviews.size(); i++) {
            data.add(new Json(d.get(i),jviews.get(i).getRs()+""));
        }
        for (Json datum : data) {
            System.out.println(datum);
        }
    }
    @Test
    public void test8(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        QueryStudentSevenServiceImpl queryStudentSevenServiceImpl = context.getBean("queryStudentSevenServiceImpl", QueryStudentSevenServiceImpl.class);
        ArrayList<String> d = DateUtil.getDates();
        ArrayList<Jview> jviews = queryStudentSevenServiceImpl.queryJZT(new query(d.get(0), d.get(1), d.get(2), d.get(3), d.get(4), d.get(5), d.get(6)));
        ArrayList<Jview> jviews1 = queryStudentSevenServiceImpl.queryJCD(new query(d.get(0), d.get(1), d.get(2), d.get(3), d.get(4), d.get(5), d.get(6)));
        //ArrayList<Jview> jviews3 = queryStudentSevenServiceImpl.queryJZC(new query(d.get(0), d.get(1), d.get(2), d.get(3), d.get(4), d.get(5), d.get(6)));
        ArrayList<Json> array = DataUtil.getArray(jviews1, d);
        String json = JsonUtil.getJson(array);
        System.out.println(json);

    }
}

