<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html lang="en">

	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
		<meta name="description" content="">
		<meta name="author" content="">

		<title>发布作业</title>
		<link href="asserts/css/bootstrap.min.css" rel="stylesheet">

		<link href="asserts/css/dashboard.css" rel="stylesheet">
		<style type="text/css">
			/* Chart.js */
			
			@-webkit-keyframes chartjs-render-animation {
				from {
					opacity: 0.99
				}
				to {
					opacity: 1
				}
			}
			
			@keyframes chartjs-render-animation {
				from {
					opacity: 0.99
				}
				to {
					opacity: 1
				}
			}
			
			.chartjs-render-monitor {
				-webkit-animation: chartjs-render-animation 0.001s;
				animation: chartjs-render-animation 0.001s;
			}
		</style>
	</head>

	<body>
		<c:import url="../bar/topbar.jsp"></c:import>

		<div class="container-fluid">
			<div class="row">
                <c:import url="../bar/sidebar.jsp">
                    <c:param name="active" value="teacher"/>
                </c:import>

				<main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
					<h2>教师评分</h2>
                    <%--<h2><a class="btn btn-sm btn-success" href="add_emp.jsp" >员工添加</a></h2>--%>
					<div class="table-responsive">
						<table class="table table-striped table-sm">
							<thead>
								<tr>
									<th>科目</th>
									<th>老师</th>
									<th>分数</th>
									<th>评分</th>
								</tr>
							</thead>
							<tbody>

                            <c:forEach var="item" items="${requestScope.list}">
                                <tr>
                                    <td>${item.id}</td>
                                    <td>${item.name}</td>
                                    <td>${item.mark}</td>
                                    <td>
                                        <a class="btn btn-sm btn-primary" href="UpdateServlet?id=${item.id}">评分</a>
                                    </td>
                                </tr>
                            </c:forEach>

							</tbody>
						</table>
					</div>
				</main>
			</div>
		</div>

		<!-- Bootstrap core JavaScript
    ================================================== -->
		<!-- Placed at the end of the document so the pages load faster -->
		<script type="text/javascript" src="../asserts/js/jquery-3.2.1.slim.min.js"></script>
		<script type="text/javascript" src="../asserts/js/popper.min.js"></script>
		<script type="text/javascript" src="../asserts/js/bootstrap.min.js"></script>

		<!-- Icons -->
		<script type="text/javascript" src="../asserts/js/feather.min.js"></script>
		<script>
			feather.replace()
		</script>

		<!-- Graphs -->
		<script type="text/javascript" src="../asserts/js/Chart.min.js"></script>
		<script>


            function del() {
                var msg = "您真的确认要删除吗？";
                if(confirm(msg) == true){
                    return true;
                }else{
                    return false;
                }

            }

			var ctx = document.getElementById("myChart");
			var myChart = new Chart(ctx, {
				type: 'line',
				data: {
					labels: ["Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"],
					datasets: [{
						data: [15339, 21345, 18483, 24003, 23489, 24092, 12034],
						lineTension: 0,
						backgroundColor: 'transparent',
						borderColor: '#007bff',
						borderWidth: 4,
						pointBackgroundColor: '#007bff'
					}]
				},
				options: {
					scales: {
						yAxes: [{
							ticks: {
								beginAtZero: false
							}
						}]
					},
					legend: {
						display: false,
					}
				}
			});
		</script>

	</body>

</html>