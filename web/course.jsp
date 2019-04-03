<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<!-- saved from url=(0042)https://v3.bootcss.com/examples/jumbotron/ -->
<html lang="zh-CN">

<head>
	<%@ include file="Component/header.jsp" %>
	<link href="${host}/css/course.css?v=${version}" rel="stylesheet">
</head>
<body>

	<!-- Fixed navbar -->
	<%@ include file="Component/navigator.jsp" %>

	<div class="title">
		<div class="container title_content">
			<h1>${data.course.title}</h1>
			<img alt="liner" src="${imageHost}/image/liner.png" class="title_image">
		</div>
	</div>


	<div class="container">
		<!-- Example row of columns -->
		<div class="row">
			<div class="col-md-4">
				<div class="thumbnail">
					<img alt="hsk 考试" src="${imageHost}/image/course/item1.jpg">
					<div class="caption">
						<h3>
							${data.course.item1.title}
						</h3>
						<p>
							${data.course.item1.content}
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="thumbnail">
					<img alt="Beginner Chinese" src="${imageHost}/image/course/item2.jpg">
					<div class="caption">
						<h3>
							${data.course.item2.title}
						</h3>
						<p>
							${data.course.item2.content}
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="thumbnail">
					<img alt="Intermediate Chinese" src="${imageHost}/image/course/item3.png">
					<div class="caption">
						<h3>
							${data.course.item3.title}
						</h3>
						<p>
							${data.course.item3.content}
						</p>
					</div>
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-md-4">
				<div class="thumbnail">
					<img alt="Advanced Chinese" src="${imageHost}/image/course/item4.png">
					<div class="caption">
						<h3>
							${data.course.item4.title}
						</h3>
						<p>
							${data.course.item4.content}
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="thumbnail">
					<img alt="日语，韩语，法语，西语等小语种培训" src="${imageHost}/image/course/item5.jpg">
					<div class="caption">
						<h3>
							${data.course.item5.title}
						</h3>
						<p>
							${data.course.item5.content}
						</p>
					</div>
				</div>
			</div>

			<div class="col-md-4">
				<div class="thumbnail">
					<img alt="成人英语培训" src="${imageHost}/image/course/item6.jpg">
					<div class="caption">
						<h3>
							${data.course.item6.title}
						</h3>
						<p>
							${data.course.item6.content}
						</p>
					</div>
				</div>
			</div>
		</div>
	</div>



	<!-- /container -->

	<%@ include file="Component/footer.jsp" %>
</body>

</html>