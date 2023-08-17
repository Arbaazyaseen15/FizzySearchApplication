
```markdown
# Fuzzy Search REST API Documentation

This documentation provides details on how to use the Fuzzy Search REST API to search for food items based on a search query.

## API Endpoint

```
GET /api/food/search
```

## Parameters

- **query**: The search query parameter. This should be the name of the food item you want to search for. The search is case-insensitive and can tolerate small spelling mistakes.

## Example Usage

Assuming the API is deployed at `https://your-api-url.com`:

### Request

```
GET https://your-api-url.com/api/food/search?query=Pizza
```

### Response

```json
{
  "results": [
    {
      "id": "1",
      "name": "Domino's Cheese Pizza",
      "description": "Delicious cheese pizza from Domino's.",
      "price": 10.99
    },
    {
      "id": "2",
      "name": "Pepperoni Pizza",
      "description": "Classic pepperoni pizza with tomato sauce and cheese.",
      "price": 12.99
    }
    // Other matching results...
  ]
}
```

## Example Queries and Responses

### Query: "Cheeseburger"

#### Request

```
GET https://your-api-url.com/api/food/search?query=Cheeseburger
```

#### Response

```json
{
  "results": [
    {
      "id": "5",
      "name": "Classic Cheeseburger",
      "description": "Juicy beef patty with cheese, lettuce, and tomato.",
      "price": 8.99
    }
    // Other matching results...
  ]
}
```

### Query: "Fries"

#### Request

```
GET https://your-api-url.com/api/food/search?query=Fries
```

#### Response

```json
{
  "results": [
    {
      "id": "7",
      "name": "Crispy French Fries",
      "description": "Golden-brown and crispy potato fries.",
      "price": 3.99
    }
    // Other matching results...
  ]
}
```

## Notes

- The API is designed to provide search results that match the search query with small spelling mistakes and in any order of words.
- The `results` array in the response contains a list of food items that match the search query.
- Each food item in the `results` array includes the `id`, `name`, `description`, and `price` attributes.
```

You can save this content into a `.md` file using a text editor, and then you can render it as formatted documentation in Markdown-supporting platforms like GitHub or other documentation tools.
