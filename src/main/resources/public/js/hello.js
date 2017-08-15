function print(){
var sql=document.getElementById("input").value;
loadXMLDoc(sql);
}
function loadXMLDoc(sql)
{
	var xmlhttp;
	var result;
	if (window.XMLHttpRequest)
	{
		// IE7+, Firefox, Chrome, Opera, Safari 浏览器执行代码
		xmlhttp=new XMLHttpRequest();
	}
	else
	{
		// IE6, IE5 浏览器执行代码
		xmlhttp=new ActiveXObject("Microsoft.XMLHTTP");
	}
	xmlhttp.onreadystatechange=function()
	{
		if (xmlhttp.readyState==4 && xmlhttp.status==200)
		{
			result=xmlhttp.responseText;
			//document.write(result);
			draw(result);

		
        }
	}
	xmlhttp.open("GET","/list/"+sql,true);
	xmlhttp.send();
	
}
function draw(result){
	//document.write(result);
	var j=JSON.parse(result);
	//var  j1=JSON.parse(j.result[0]);
	//alert(j[0].name);
	//var name=JSON.parse((j.result)[0]);
    
	var myChart = echarts.init(document.getElementById('main'));
	
			// 指定图表的配置项和数据
			var option = {
				title: {
					text: '姓名和年龄'
				},
				tooltip: {},
				legend: {
					data:['名字']
				},
				xAxis: {
					data: [j[0].name,j[1].name]
				},
				yAxis: {},
				series: [{
					name: '年龄',
					type: 'bar',
					data: [j[0].age,j[1].age]
				}]
			};
	
			// 使用刚指定的配置项和数据显示图表。
			myChart.setOption(option);
}