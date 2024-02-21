

# WESTERN GOVERNOR UNIVERSITY 
## D287 – JAVA FRAMEWORKS
## Kerrie Abrams


This is a complete list of changes including the prompt, file name, and line number.

<details>
<summary>Part C</summary>
Customize the HTML user interface for your customer’s application.
The user interface should include the shop name, the product names, and the names of the parts.

#### Changes:
>mainscreen.html line 14: Updated title to "Just Keyboards"

>mainscreen.html line 19: Updated header to "Just Keyboards"

</details>

<details>
<summary>Part D</summary>
Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.

#### Changes:
>src/resources/templates: created aboutpage.html and added "About Us" content

>java/com.example.demo/controllers: created AboutPageController.java and added a controller class that maps to the aboutpage

>mainscreen.html line 21: added navigation to the aboutpage
</details>

<details>
<summary>Part E</summary>
Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.

#### Changes:
</details>

<details>
<summary>Part F</summary>
Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.

#### Changes:
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
</details>


<details>
<summary>Part H</summary>
 Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.

#### Changes:
</details>


<details>
<summary>Part I</summary>
Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.

#### Changes:
</details>


<details>
<summary>Part J</summary>
Remove the class files for any unused validators in order to clean your code.

#### Changes:
</details>