<!DOCTYPE html>
<html>
<head>
        <meta charset=UTF-8">
        <title>Product Maintenance</title>
        <link rel="stylesheet" href="styles/main.css" type="text/css"/>
</head>
<body>
        
<h1>Products</h1>
        
<table>
  <tr>
    <th>Quantity</th>
    <th>Description</th>
    <th>Price</th>
    <th>Amount</th>
  </tr>
</table>
  
  <br>
  <form action="product.jsp" method="post">
      <input type="hidden" name action="action" value="Add Product">
      <input type="submit" value="Add Product">
  </form>
  
</body>
</html>
