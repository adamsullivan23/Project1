<!-- Remember to remove borders from around the first table. Try using another CSS file --> 
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>Product Maintenance</title>
    <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
    <body>
        <h1>Product</h1>
        
    <!-- Table starts here -->          
<table>
    <tr>
        <td>Code:</td>
        <td><input type="text" name="code" required></td>
    </tr>
    <tr>
        <td>Description:</td>
        <td><input type="text" name="description" required></td2>
    </tr>
    <tr>
        <td>Price:</td>
        <td><input type="number" name="price" required></td>
    </tr>
</table>
<br>    
    
    <!-- Form starts here -->  
<table>
    <tr>
        <form action="" method="post">
        <input type="hidden" name="action" value="update">
        <input type="submit" value="Update Products">
        </form>

        <form action="products.jsp" method="post">
        <input type="hidden" name="action" value="view">
        <input type="submit" value="View Products">
        </form>
    </tr>
            
</table>

</body>
</html>
