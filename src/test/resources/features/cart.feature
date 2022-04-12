Feature: Cart operations

    Scenario Outline: Add a product
        Given "the actor" opened the website
        When the actor selects the product
            | subcategory   | product   |
            | <subcategory> | <product> |
        And the actor adds the product to the cart with
            | sizeType     | size     |
            | <sizeType>   | <size>   |
        Then the actor will see the product in the cart

        Examples:
            | subcategory | product                    | size |
            | Paints      | Hyperspace Turquoise Paint | 1l   |
            | T-shirts    | Code Division T-shirt      | XL   |
            | Alcohol     | Seaman Beer                |      |
