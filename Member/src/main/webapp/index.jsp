
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/foundation/6.2.3/foundation.css"
	rel="stylesheet" />
</head>
<body ng-app="myApp" ng-controller="myController">


<h1>Memeber Registration Area---</h1>

{{message}}
<input type=text ng-model="member.name" placeholder="Enter Name"/>
<input type=text ng-model="member.salary" placeholder="Enter Salary"/>
<button ng-click="addData()">Add Data</button>
<br>
	<h1>Members are:</h1>
	<input type=text ng-model="search.name" placeholder="Search By Name"/>
	<input type=text ng-model="search.salary" placeholder="Search By Salary"/>
	<input type=text ng-model="search.$" placeholder="Search By All"/>
	<button ng-click="loadData()">Load Data</button>
	<table>
		<tr>
			<th>Name</th>
			<th>Salary</th>
		</tr>

		<tr ng-repeat="member in members | filter: search | orderBy:'name'">
			<td>{{member.name}}</td>
			<td>{{member.salary}}</td>
		</tr>

	</table>

	<script
		src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.7/angular.min.js
"></script>
	<script>
		var app = angular.module('myApp', []);

		app.controller('myController', function($scope, $http) {
			$scope.loadData = function() {
				$http({
					url : 'rest/findAll',
					method : 'GET'
				}).success(function(data) {
					console.log('Recieved something from the server')
					console.log(data);
					$scope.members = data;
				})
			};
			
			$scope.addData = function() {
				$http({
					url : 'rest/add',
					method : 'POST',
					data: $scope.member
				}).success(function(data, status) {
					console.log('Recieved something from the server')
					console.log(data);
					console.log(status);
					$scope.members = data;
					$scope.member={};
					if(status==201){
						$scope.message = "Registered Successfully"
						$scope.loadData();
					}
					
				})
			};
			
			
		})
	</script>
</body>
</html>