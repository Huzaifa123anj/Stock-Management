<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

    <title>LIST PAGE</title>
    <link rel="stylesheet" href="Style2.css">
  </head>
  <body>
    
    
    <!-- Nav Bar -->
    
    
    <nav class="navbar navbar-expand-lg navbar navbar-dark bg-dark">
  <a class="navbar-brand" href="#">STOCK MANAGMENT</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
    <span class="navbar-toggler-icon"></span>
  </button>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    <ul class="navbar-nav mr-auto">
      <li class="nav-item active">
        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">About Us</a>
      </li>
      
      </li>
      <li class="nav-item">
        <a class="nav-link" href="#">Contact Us</a>
      </li>

    </ul>
    
    <ul class="navbar-nav mi auto">
    <li class="nav-item">
    <a href="#" class="nav-link">
    <i class="fa fa-user"></i>WELCOME ${user.firstName} 
    </a>
    </li>
    </a>
    </li>
    <li class="nav-item">
    <a href="UserController?command=LOGOUT" class="nav-link">
    <i class="fa fa-user"></i>LOGOUT
    </a>
    </li>
    </a>
    </li>
    
    </ul>
  </div>
</nav>
<div class="container-fluid ">
<header id="main-header" class="py-2 bg-warning text-white">
    <div class="container-fluid">
      <div class="row">
        <div class="col-xl">
        <h1>Grocery Stock Management</h1>
        </div>
      </div>
    </div>
  </header>
  </div>
  
  <br>
  <div class="container-fluid">
	<form action="#">
	<button type="submit" class="btn btn-primary">Add Item</button>
	</form>
	<br>
	<form class="form-inline my-2 my-lg-0" action="#">
	 <input type="hidden" name="command" value="SEARCH"/>
      <input class="form-control mr-sm-2" type="search" name="searchName" placeholder="Search" aria-label="Search">
      <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    </form>   
	</div>
	<br>
	<div class="container-fluid">
<table class="table table-hover">
				<tr style>
					<th>Item Code</th>
					<th>Item Name</th>
					<th>Unit</th>
					<th>Beginning Inventory</th>
					<th>Quantity in Hand</th>
					<th>Price perUnit</th>
					<th>Manufacture</th>
					<th>Expiry</th>
					<th>Location</th>
					<th>Action</th>
					</tr>
					</thead>
    
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
  </body>
</html>