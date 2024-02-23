

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
## Kerrie Abrams


This is a complete list of changes including the prompt, file name, and line number.

<details>
<summary>Part C</summary>
Customize the HTML user interface for your customer’s application.
The user interface should include the shop name, the product names, and the names of the parts.

#### Changes:
> mainscreen.html line 14: Updated title to "Just Keyboards"

> mainscreen.html line 19: Updated header to "Just Keyboards"

</details>

<details>
<summary>Part D</summary>
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

#### Changes:
> src/main/resources/templates: Created aboutpage.html and added "About Us" content

> src/main/java/com.example.demo/controllers: Created AboutPageController.java and added a controller class and method that allows navigation to the aboutpage

> mainscreen.html line 21: Added navigation to the aboutpage
</details>

<details>
<summary>Part E</summary>
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

#### Changes:
> BootStrapData.java lines 43-80: Added 5 different parts to the part repository

> BootStrapData.java lines 96-107: Added 5 different products to the product repository
</details>

<details>
<summary>Part F</summary>
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

#### Changes:

> src/resources/templates: Created buyfail.html

> src/resources/templates: Created buysuccess.html

> ProductServiceImpl.java lines 70-77: Created a buyByID method that decrements a product inv value by 1

> ProductService.java line 20: Defined the buyByID method

> AddProductControllet.java lines 177-188: Created a buyproduct controller that calls the buyByID method and returns the appropriate buy response: buyfail.html or buysucces.html

> mainscreen.html line 85: Added a "Buy Now" button for products that maps to the buyproduct controller
</details>

<details>
<summary>Part G</summary>
Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.

#### Changes:
> Part.java lines 33-36: Defined maximum and minimum inventory fields

> Part.java lines 91-97: Defined setter and getter methods

> BootStrapData.java lines 50-51, 60-61, 69-70, 78-79, 87,88: Modified sample part inventory to include the new fields

> InhousePartForm.html lines 24-28: Added form fields for min and max inventory

> OutsourcedPartForm.html lines 25-29: Added form fields for min and max inventory

> mainscreen.html lines 40-41: Added min and max inventory table headers

> mainscreen.html lines 50-51: Added min and max inventory table data

> spring-boot-h2-db102.mv.db: Renamed to spring-boot-h2-db103

> application.properties line 6: Updated datasource spring-boot-h2-db102 to spring-boot-h2-db103

> src/main/java/com.example.demo/validators: Created ValidInventoryValue.java annotation

> src/main/java/com.example.demo/validators: Created InventoryValueValidator.java class

> ValidInventoryValue.java: Defined the constraint annotation that is validated by the InventoryValueValidator class

> InventoryValueValidator.java: Defined the validator that accepts a Part object as a parameter and determines if the inventory value is within the assigned maximum and minimum values

> Part.java line 23: Applied the new constraint to the Part class 

> InhousePartForm.html line 22: Updated the error message code to display all applicable errors for the inv field

> OutsourcedPartForm.html line 23: Updated the error message code to display all applicable errors for the inv field

</details>


<details>
<summary>Part H</summary>
 Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

#### Changes:

> InventoryValueValidator.java lines 25-41: Updated the validator to notify the user whether the inventory is too high or low when adding parts or updating parts

> EnufPartsValidator.java line 37: Added additional logic to prevent submitting a product with a part that would lower the inventory below the minimum

> AddProductController.java lines 109, 158, 191: Added an array that is initialized everytime a product is updated and stores parts that are added to the associate parts

> AddProductController.java lines 81-84: Added a for loop that iterates over the array, updating the inventory of each added part after the form is submitted

</details>


<details>
<summary>Part I</summary>
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

#### Changes:

> PartTest.java lines 160-167: Created a unit test to test the minimum inventory field

> PartTest.java lines 169-176: Created a unit test to test the maximum inventory field
</details>


<details>
<summary>Part J</summary>
Remove the class files for any unused validators in order to clean your code.

#### Changes:

> src\main\java\com\example\demo\validators: Removed DeletePartValidator.java
</details>