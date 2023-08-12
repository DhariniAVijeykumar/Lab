<!DOCTYPE html>
<html>
<head>
	<title>Retrieving data </title>
</head>
<body>
	<center>
		<?php
		// Connect to the database
        $host = "localhost"; 
        $username = "root"; 
        $password = ""; 
        $dbname = "student"; 
		$conn = mysqli_connect("localhost", "root", "", "student");
		// Check connection
		if($conn === false){
			die("ERROR: Could not connect. "
				. mysqli_connect_error());
		}
		$Name = $_REQUEST['Name'];
		$Student_id = $_REQUEST['Student_id'];
		$Phone_no = $_REQUEST['Phone_no'];
		$Address = $_REQUEST['Address'];
		$Email_id = $_REQUEST['Email_id'];
		// Performing insert query execution
		$sql = "INSERT INTO student1 VALUES ('$Name',
			'$Student_id','$Phone_no','$Address','$Email_id')";
		
		if(mysqli_query($conn, $sql)){
			echo "<h3>data stored successfully</h3>";

		} else{
			echo "ERROR: Hush! Sorry $sql. "
				. mysqli_error($conn);
		}
		// Retrieve data from the database
        $sql = "SELECT * FROM student1";
        $result = mysqli_query($conn, $sql);
        // Display the data on the web page
        echo "<table>";
        echo "<tr><th>Name</th><th>Student_id</th><th>Phone_no</th><th>Address</th><th>Email_id</th></tr>";
        while ($row = mysqli_fetch_assoc($result)) {
        echo "<tr>";
        echo "<td>" . $row["Name"] . "</td>";
        echo "<td>" . $row["Student_id"] . "</td>";
        echo "<td>" . $row["Phone_no"] . "</td>";
        echo "<td>" . $row["Address"] . "</td>";
        echo "<td>" . $row["Email_id"] . "</td>";
        echo "</tr>";
}
echo "</table>";
	// Close connection
		mysqli_close($conn);
		?>
</center>
</body>
</html>
