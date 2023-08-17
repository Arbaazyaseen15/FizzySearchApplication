
```markdown
# Fuzzy Search REST API Documentation

This documentation provides details on how to use the Fuzzy Search REST API to search for food items based on a search query.

## API Endpoint

```
GET https://api-url.com/search?query=<string>
```

## Parameters

- **query**: The search query parameter. This should be the name of the food item you want to search for. The search is case-insensitive and can tolerate small spelling mistakes.

## Example Usage

Assuming the API is deployed at `https://api-url.com`:

### Request

```
GET https://api-url.com/search?query=Pizza
```

### Response

```json
{
  "results": [
    {
      "id": "1",
      "name": "Domino's Cheese Pizza",
      "description": "Delicious cheese pizza from Domino's."
    },
    {
      "id": "2",
      "name": "Pepperoni Pizza",
      "description": "Classic pepperoni pizza with tomato sauce and cheese."
    }
    // Other matching results...
  ]
}
```

## Example Queries and Responses

### Query: "Cheeseburger"

#### Request

```
GET https://api-url.com/search?query=Cheeseburger
```

#### Response

```json
{
  "results": [
    {
      "id": "5",
      "name": "Classic Cheeseburger",
      "description": "Juicy beef patty with cheese, lettuce, and tomato."
    }
    // Other matching results...
  ]
}
```

### Query: "Fries"

#### Request

```
GET https://api-url.com/search?query=Fries
```

#### Response

```json
{
  "results": [
    {
      "id": "7",
      "name": "Crispy French Fries",
      "description": "Golden-brown and crispy potato fries."
    }
    // Other matching results...
  ]
}
```

## Notes

- The API is designed to provide search results that match the search query with small spelling mistakes and in any order of words.
- The `results` array in the response contains a list of food items that match the search query.
- Each food item in the `results` array includes the `id` and `name` attributes.
```
