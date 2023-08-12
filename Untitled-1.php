<?php

// Connect to the database
$host = "localhost"; // replace with your MySQL host
$username = "root"; // replace with your MySQL username
$password = ""; // replace with your MySQL password
$dbname = "mydatabase"; // replace with your MySQL database name

$conn = mysqli_connect($host, $username, $password, $dbname);

// Check connection
if (!$conn) {
  die("Connection failed: " . mysqli_connect_error());
}

// Retrieve data from the database
$sql = "SELECT * FROM mytable";
$result = mysqli_query($conn, $sql);

// Display the data on the web page
if (mysqli_num_rows($result) > 0) {
  while($row = mysqli_fetch_assoc($result)) {
    echo "Name: " . $row["name"] . "<br>";
    echo "Email: " . $row["email"] . "<br>";
    // Add more fields as needed
    echo "<br>";
  }
} else {
  echo "No data found";
}

// Close the database connection
mysqli_close($conn);

?>

echo "<table>";
echo "<tr><th>First Name</th><th>Last Name</th><th>Contact</th><th>Address</th><th>Email</th></tr>";
while ($row = mysqli_fetch_assoc($result)) {
    echo "<tr>";
    echo "<td>" . $row["first_name"] . "</td>";
    echo "<td>" . $row["last_name"] . "</td>";
    echo "<td>" . $row["phone"] . "</td>";
    echo "<td>" . $row["address"] . "</td>";
    echo "<td>" . $row["email"] . "</td>";
    echo "</tr>";
}
echo "</table>";