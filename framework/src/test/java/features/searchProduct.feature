Feature: Search and place the order of a product
@OffersPage
Scenario Outline: Verify functionaity of Tomato product
Given when user is on Greenkart landing page
When user searched with Shortname <Name> and extracted actual name of product
Then user searched for Shortname <Name> in offers page to check if product exist
Then validate product in offers and landing page
#When User search for Tomoto product
#And clicks on search
#Then Tomato product is dispayed 
#And user clicks on Tops deals and search for Tomato product
#Then Tomato product is dispayed in results
Examples:
| Name |
| Tom |
| Beet |