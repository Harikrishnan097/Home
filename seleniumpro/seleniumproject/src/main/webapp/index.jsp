<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="css/bootstrap.min.css" rel="stylesheet">
<link href="css/styleapp.css" rel="stylesheet">

<title>Contact form</title>
</head>
<body>
	<div class="container-fluid">
		<div class="col-md-4 col-md-offset-4">
			<center>
				<h1 style="color:#ffffff ;" >Registration Form</h1>
			</center>
			
			<div class="form-group">
			<form>

				<label class="label label-default"> Name </label>
				 <input type="text"class="form-control" name="username"placeholder="Enter the Username" required><br> 
				 <label class="label label-default"> Enter the password </label>
<input type="password" class="form-control" name="password"placeholder="Enter the password" required>
					<br> 
					<label class="label label-default"> Re-Enter the password </label>
<input type="password" class="form-control" name="rpassword"placeholder="Enter the password" required>
					<br> 
					<label class="label label-default"> Select Gender </label>
					<div class="custom-control custom-radio">
  <input type="radio" class="custom-control-input" id="male" name="male">
  <label class="custom-control-label" for="male">Male</label>
  <input type="radio" class="custom-control-input" id="female" name="female">
  <label class="custom-control-label" for="female">Female</label>
</div>
					<br>
					
					
<label class="label label-default"> Date of birth </label> 
<input type="date" class="form-control" name="dob" required><br>
<label class="label label-default"> Qualification </label><br> 
<input type="checkbox" class="form-check-input" id="pg" >
 <label class="form-check-label" for="java">PG</label> 
 <input type="checkbox" class="form-check-input" id="ug">
  <label class="form-check-label" for="java">UG</label>
  <input type="checkbox" class="form-check-input" id="phd">
   <label class="form-check-label" for="java">PHD</label> <br>
				<br> 
<label class="label label-default"> Select Country</label> 
<select id="country" class="form-control">
					<option>UNITED STATES</option>
					<option>INDIA</option>
					<option>RUSSIA</option>
				</select> <br>

				<center>
<input type="text" class="form-check-input" disabled="disabled" value="AcSa" style=" height : 25pt; width: 80px; font-size: 20pt; background-color: #d7d0c8; color: #D2691E;" />
				</center>
				<label class="label label-default" >Enter the captha</label> <input
					type="text" class="form-control" name="captha"
					placeholder="Enter Captha" required><br>



				<center>
					<button class=" btn btn-success" type="submit">SUBMIT</button>
				</center>
			</form>
			</div>
		</div>
	</div>
</body>
</html>