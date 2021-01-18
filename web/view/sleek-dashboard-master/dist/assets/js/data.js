  
window.onload = function getdata(){
  var flag = 0,
  zc,
  cd,
  zt,
  kk;     
  $.ajax({url: "http://localhost:8080/feiqian/getJzc",type:'GET',dataType:'json',success: function(data1){
          flag++;
          zc = data1;
          $("#jrzc").html(zc["rs"])
          if(flag == 3){
              //do something
          }
      }
  })

  $.ajax({url: "http://localhost:8080/feiqian/getJcd",type:'GET',dataType:'json',success: function(data2){
          flag++;
          cd = data2;
          $("#jrcd").html(cd["rs"])
          if(flag == 3){
              //do something
          }
      }
  })

  $.ajax({url: "http://localhost:8080/feiqian/getJzt",type:'GET',dataType:'json',success: function(data3){
          flag++;
          zt = data3;
          $("#jrzt").html(zt["rs"])
          if(flag == 3){
              //do something
          }
      }
  })
  kk=9;
  $("#jrkk").html(kk);





       //七
}
