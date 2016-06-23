<%@include file="header.jsp"%>


<section id="mainContent">

	<div class="row">

		<div class="col-sm-offset-2 col-sm-8">

			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">Register</h3>
				</div>
				<div class="panel-body">
					<form action="#" method="post">

						<div class="form-group">
							<label for="username">Select a username: </label> <input
								type="text" class="form-control" placeholder="Enter Username"
								name="username">
						</div>

						<div class="form-group">
							<label for="email">Your email id: </label> <input type="email"
								class="form-control" placeholder="Enter Email" name="email">
						</div>

						<div class="form-group">
							<label for="password">Password: </label> <input type="password"
								class="form-control" placeholder="Password" name="password">
						</div>


						<div class="form-group">
							<label for="password">Confirm Password: </label> <input
								type="password" class="form-control"
								placeholder="Re-enter Password" name="confirmPassword">
						</div>


						<div class="form-group">
							<input type="submit" class="btn btn-primary btn-md"
								value="Register">
						</div>


					</form>
				</div>
			</div>

		</div>


	</div>
</section>


<%@include file="footer.jsp"%>
