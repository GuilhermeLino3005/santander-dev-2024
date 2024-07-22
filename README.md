````mermaid
classDiagram
    class User {
        +String name
        +Account account
        +Feature[] features
        +Card card
        +News news
    }

    class Account {
        +String accountNumber
        +String accountAgency
        +double accountBalance
        +double accountLimit
    }

    class Feature {
        +String icon
        +String description
    }

    class Card {
        +String cardNumber
        +double cardLimit
    }

    class News {
        +String newsIcon
        +String newsDescricao
    }

    User *-- Account
    User *-- Feature
    User *-- Card
    User *-- News
