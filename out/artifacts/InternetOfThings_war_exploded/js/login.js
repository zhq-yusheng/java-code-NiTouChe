function login(){
    var ps=document.getElementById("ps").value;
    var us=document.getElementById("us").value;
    
    $.ajax(
      {
      url:"../../../login",    //请求的url地址
      dataType:"json",   //返回格式为json
      async:true,//请求是否异步，默认为异步，这也是ajax重要特性
      data:{"uName":us,"PWD":ps},    //参数值
      type:"POST",   //请求方式
      
      //请求成功时处理
      success:function(req){
        if(req['code']=="200"){
            var URL = "../dist/index.html";
            window.location.replace(URL + window.location.search);
          return;
        }else{
          alert(req.msg+",用户名或密码错误！");
          return;
        }
      },
      error:function(){
        var URL = "../dist/index.html";
        //window.location.replace(URL + window.location.search);
        alert("Error！");
        return false;
        //请求出错处理
      }
    });
  
    }