<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>카카오맵 테스트 중 입니다!</title>
    <!-- https://fonts.google.com/?subset=korean&noto.script=Kore  폰트 스타일 -->
    <style>
        
    </style>
</head>
	<!-- 네이버 지도API -->
	<!-- <script type="text/javascript" src="https://oapi.map.naver.com/openapi/v3/maps.js?ncpClientId=3bu1logtcs"></script> -->
	
	<!-- 카카오 지도API -->
	<script type="text/javascript" src="//dapi.kakao.com/v2/maps/sdk.js?appkey=63c0f4f3e00e8d6c49088160aa0fdd64"></script>
	
	<link rel="shortcut icon" href="./resources/project/image/favicon/favicon.ico">
	<link rel="stylesheet" href="./resources/project/css/nav.css">
	
<body>

	<div id="map" style="width:1800px;height:800px;"></div>
	<p id="result"></p>

   
    
    <!-- 네이버 지도API -->
    <!-- <script>
		var mapOptions = {
		    center: new naver.maps.LatLng(36.350765457557735, 127.45304248848758),	//지도의 중심좌표.
		    zoom: 17	//지도의 레벨(확대, 축소 정도)
		};
		
		var map = new naver.maps.Map('map', mapOptions);	//지도 생성 및 객체 리턴
	</script> -->
	
	<!-- 카카오 지도API -->
	<script>
		var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
		var options = { //지도를 생성할 때 필요한 기본 옵션
			center: new kakao.maps.LatLng(36.350765457557735, 127.45304248848758), //지도의 중심좌표.
			level: 3 //지도의 레벨(확대, 축소 정도)
		};
	
		var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴
		
		// 지도에 클릭 이벤트를 등록합니다
		// 지도를 클릭하면 마지막 파라미터로 넘어온 함수를 호출합니다
		kakao.maps.event.addListener(map, 'click', function(mouseEvent) {        
		    
		    // 클릭한 위도, 경도 정보를 가져옵니다 
		    var latlng = mouseEvent.latLng;
		    
		    var message = '클릭한 위치의 위도는 ' + latlng.getLat() + ' 이고, ';
		    message += '경도는 ' + latlng.getLng() + ' 입니다';
		    
		    var resultDiv = document.getElementById('result'); 
		    resultDiv.innerHTML = message;
		    
		});
	</script>
    
</body>
</html>