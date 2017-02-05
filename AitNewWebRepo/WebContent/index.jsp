<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>A.I.T 2.0</title>
<link rel="icon" href="template/images/favicon.ico" type="image/x-icon"/>
<link rel="shortcut icon" href="template/images/favicon.ico" type="image/x-icon"/>
	
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<link rel="stylesheet" href="css/custom.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>
<body>
	<header id="navbar-top" class="banner navbar navbar-default" role="banner">
		<div class="panel-affix affix-top" data-spy="affix" data-offset-top="79">
			<div id="header-container" class="container">
				<div class="navbar-inner">
					<button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        				<span class="sr-only">Toggle Navigation</span>
       					<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
        				<span class="icon-bar"></span>
     				</button>
     				<a class="brand" href="http://localhost:8080/WebPortal/">
     				Association of Ivorians in Texas</a>
     				<a class="brand-piccolo" href="http://localhost:8080/WebPortal/">
     				Association of Ivorians in Texas</a>
					<nav class="collapse navbar-collapse" role="navigation">
						<ul id="menu-primary-navigation-en" class="nav navbar-nav">
							<li class="menu-home"><a
								href="http://localhost:8080/WebPortal/" class=" roll"><span
									data-title="Home">Home</span></a></li>
							<li class="menu-about"><a
								href="#about-us" class=" roll"><span
									data-title="About Us">About Us</span></a></li>
							<li class="menu-portfolio"><a href="#events"
								class=" roll"><span data-title="events">Events</span></a></li>
							<li class="menu-Promotion"><a href="#Promotion"
								class=" roll"><span data-title="Promotion">Promotion</span></a></li>
							<li class="menu-gallery"><a
								href="#contacts" class=" roll"><span
									data-title="Gallery">Gallery</span></a></li>
							<li class="menu-donation"><a
								href="#donation" class=" roll"><span
									data-title="Donation">Donation</span></a></li>
						</ul>
					</nav>
				</div> <!-- navbar-inner -->
			</div><!-- Container -->
		</div><!-- panel-affix -->
		<svg width="530" height="120" id=navbar-tail class="banner">
			<path
			  d="M 0 0 C -800  2000 -1000 0 500  0 "
			fill= "forestgreen"> 
			</path>
		</svg><!-- End of SVG navbar tail -->

	</header>

<!-- Carousel -->
<!--  	<div class="overlay"></div> -->
	<div id="myCarousel" class="carousel slide " data-ride="carousel">
		<!-- Indicators -->
		<ol class="carousel-indicators">
			<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
			<li data-target="#myCarousel" data-slide-to="1"></li>
			<li data-target="#myCarousel" data-slide-to="2"></li>
			<li data-target="#myCarousel" data-slide-to="3"></li>
		</ol>

		<!-- Wrapper for slides -->
		<div class="carousel-inner">
			<div class="item active">
				<img src="images/slideshow/1.png" alt="slide1">
				<div class="carousel-caption">
					<h3>
						TOGETHER WE STAND <br> A THRIVING COMMUNITY
					</h3>
					<p>Promote and achieve a well integrated, well educated, and
						well-to-do community.</p>
				</div>
			</div>

			<div class="item">
				<img src="images/slideshow/2.png" alt="slide2"
					class="img-responsive center-block">
				<div class="carousel-caption">
					<h3>IVORIAN PICNIC DURING SUMMERTIME</h3>
					<p>COME SOCIALIZE AND HAVE FUN WITH US</p>
				</div>
			</div>

			<div class="item">
				<img src="images/slideshow/3.png" alt="slide3"
					class="img-responsive center-block">
				<div class="carousel-caption">
					<h3>HAPPY INDEPENDANCE DAY</h3>
					<p>Cote d'Ivoire just celebrated the 56th year of Independence</p>
				</div>
			</div>

			<div class="item">
				<img src="images/slideshow/4.png" alt="slide4">
				<div class="carousel-caption">
					<h3>HAPPY INDEPENDANCE DAY</h3>
					<p>Cote d'Ivoire just celebrated the 56th year of Independence
						from France</p>
				</div>
			</div>

		</div>

		<!-- Left and right controls -->
		<a class="left carousel-control" href="#myCarousel" role="button"
			data-slide="prev"> <span class="glyphicon glyphicon-chevron-left"
			aria-hidden="true"></span> <span class="sr-only">Previous</span>
		</a> <a class="right carousel-control" href="#myCarousel" role="button"
			data-slide="next"> <span
			class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
			<span class="sr-only">Next</span>
		</a>
	</div>


	<!-- member's form -->
	<div class="jumbotron">
		<form class="form-inline text-center">
			<div class="form-group">
				<img src="template/images/icon-question.png">
			</div>
			<div class="form-group">
				<h6>Get Connected<br>Stay Informed</h6>
			</div>
			
			<div class="form-group">
				<input type="text" class="form-control" name="fullName"
					placeholder="Your Full Name">
			</div>
			<div class="form-group">
				<input type="text" class="form-control" name="city"
					placeholder="City">
			</div>
			<div class="form-group">
				<input type="email" class="form-control" name="email"
					placeholder="Email address">
			</div>
			<button type="submit" class="btn btn-warning">REQUEST
				NEWSLETTER</button>
		</form>
	</div>

<!-- Awards and Teams -->
	<div id="infofeed" class="container text-center">
		<div class="row">
			<div class="col-md-3">SCHOLARSHIP RECIPIENT
				<img src="images/scholarshiprecipient.png" alt="scholarship recipient" class="img-thumbnail">
				<p>FULL NAME<br/>UNIVERSITY MAJOR</p>
			</div>
			<div class="col-md-6">TEAM OF THE MONTH
				<img src="images/governingteam.png" alt="team of the month" class="img-thumbnail">
				<p>TEAM OF THE MONTH</p>
			</div>
			<div class="col-md-3">MEMBER OF THE MONTH
				<img src="images/honormember.png" alt="member of the month" class="img-thumbnail">
				<p>FULL NAME<br/>OCCUPATION</p>
			</div>
		</div>
	</div>

	
<!-- News Section -->
 
	<div id="newsfeed" class="container-fluid">
		<div class="row">
			<div class="col-md-4 news-main">
				<h3>NEWS</h3>
				<img
					src="images/news/Main-News-Photo.png" alt="news" class="img-responsive">
				<h5>IVORIAN BUSINESS OWNERS IN TEXAS</h5>
			</div>


			<div class="col-md-2 news">
				<img
					src="images/news/Small-News-Photo1.png"
					alt="How to be Successful" class="img-responsive">
				<h6>HOW TO BE SUCCESSFUL</h6>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>mall>
				</p>
				<a href="#">Read more...</a>
			</div>

			<div class="col-md-2 news">
				<img
					src="images/news/Small-News-Photo2.png"
					alt="DFW Places" class="img-responsive">
				<h6>DFW PLACES</h6>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>
				</p>
				<a href="#">Read more...</a>
			</div>

		</div>
	</div>
	

	<footer class="content-info">
		<div class="bottom-advertisement">
			<div class="form-inline">
				<div class="form-group">
					SOCIAL                                  
				</div>
				<div class="form-group">
					         ADV 1   
				</div>
				<div class="form-group">
					 ADV 2 
				</div>
				
			</div>
			<br><br><br><br><br><br>
		</div>
		
	FOOTER TEXT<br><br>
	
<!-- FOOTER TEXT -->	
		<div id="footer-elements" class="container text-center">
			<div class="col-md-2">

				<h6>FOOTER 1</h6>
				<div class=line></div>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>
				</p>

			</div>

			<div class="col-md-2">

				<h6>FOOTER 2</h6>
				<div class=line></div>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>
				</p>

			</div>
			<div class="col-md-2">

				<h6>FOOTER 3</h6>
				<div class=line></div>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>mall>
				</p>

			</div>

			<div class="col-md-2">

				<h6>FOOTER 4</h6>
				<div class=line></div>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>
				</p>

			</div>
						<div class="col-md-2">

				<h6>FOOTER 5</h6>
				<div class=line></div>
				<p>
					<small>lorem ipsum lorem ipsum lorem ipsumlorem ipsumlorem
						ipsumlorem ipsum</small>
				</p>

			</div>
		</div>
	</footer>
</body>
</html>