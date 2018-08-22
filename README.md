# TuckerMillerDevWebApi
## Java Springboot Application
## Utilizing a Cloud Hosted database through Mongodb mLab

### GET Players via /players

<<<<<<< HEAD
Example Response to www.webApi.TuckerMillerDev.com/histories

=======
Example Response to www.webApi.TuckerMillerDev.com/players
```
>>>>>>> 81a79be27572370f004df986b85b78c4f2e7d912
[{
  "id":"1",

  "playerName":"Lakin Lane",

  "average": 120,

  "max": 165

},
{

  "id":"2",

  "playerName":"Tucker Miller",

  "average": 132,

  "max": 226

}]
<<<<<<< HEAD


### GET Specific Player by ID via /player/{id}

Example Response to www.webApi.TuckerMillerDev.com/history/3

=======
```

### GET Specific Player by ID via /player/{id}

Example Response to www.webApi.TuckerMillerDev.com/player/3
```
>>>>>>> 81a79be27572370f004df986b85b78c4f2e7d912
{

  "id":"3",

  "playerName":"Mitch Lewis",

  "average": 88,

  "max": 120

}
<<<<<<< HEAD

=======
```
>>>>>>> 81a79be27572370f004df986b85b78c4f2e7d912

### POST Create a Player via /player/{password}

Response Body
<<<<<<< HEAD

=======
```
>>>>>>> 81a79be27572370f004df986b85b78c4f2e7d912
{

  "id": "9999",

  "playerName": "Default Name",

  "average": 99,

  "max": 123

}
<<<<<<< HEAD

### PUT Update Player by ID via /players/{id}

=======
```
### PUT Update Player by ID via /player
```
>>>>>>> 81a79be27572370f004df986b85b78c4f2e7d912
{

  "id": "3",

  "playerName": "Updated Name",

  "average": 300,

  "max": 300

}
<<<<<<< HEAD

### DELETE Delete Player by ID via /player/{id}

No Response Body

#

### GET History via /history

Example Response to www.webApi.TuckerMillerDev.com/histories

[{
  "id":"1",

  "playerName":"Lakin Lane",

  "average": 120,

  "max": 165

},
{

  "id":"2",

  "playerName":"Tucker Miller",

  "average": 132,

  "max": 226

}]


### GET Specific Player by ID via /player/{id}

Example Response to www.webApi.TuckerMillerDev.com/history/3

{

  "id":"3",

  "playerName":"Mitch Lewis",

  "average": 88,

  "max": 120

}


### POST Create a Player via /player/{password}

Response Body

{

  "id": "9999",

  "playerName": "Default Name",

  "average": 99,

  "max": 123

}

### PUT Update Player by ID via /players/{id}

{

  "id": "3",

  "playerName": "Updated Name",

  "average": 300,

  "max": 300

}

### DELETE Delete Player by ID via /player/{id}

No Response Body
=======
```
### DELETE Player by ID via /player/{id}

```No Response Body```

#

### GET all Archives via /archives

Example Response to www.webApi.TuckerMillerDev.com/archives

```
[{
   "id": "3",
      "playerName": "Mitch Lewis",
      "games": 
      { 
         "id": "1",
         "playerName": "Mitch Lewis",
         "score": 102,
         "date": "2017-10-20T04:00:00.000+0000"
      },
      {
         "id": "2",
         "playerName": "Mitch Lewis",
         "score": 106,
         "date": "2017-10-20T04:00:00.000+0000"
      }
   ]
},
{
   "id": "1",
   "playerName": "Lakin Lane",
   "games": [
      { 
         "id": "1",
         "playerName": "Lakin Lane",
         "score": 145,
         "date": "2017-10-20T04:00:00.000+0000"
      },
      {
         "id": "2",
         "playerName": "Lakin Lane",
         "score": 120,
         "date": "2017-10-20T04:00:00.000+0000"
      }
   ]
}]

```

### GET Specific Player Archive by ID via /player/{id}/archive

Example Response to www.webApi.TuckerMillerDev.com/player/1/archive
```
[{
   "id": "1",
   "playerName": "Lakin Lane",
   "games": [
      { 
         "id": "1",
         "playerName": "Lakin Lane",
         "score": 145,
         "date": "2017-10-20T04:00:00.000+0000"
      },
      {
         "id": "2",
         "playerName": "Lakin Lane",
         "score": 120,
         "date": "2017-10-20T04:00:00.000+0000"
      }
   ]
}]
```

### POST Create a Archive via /archive

Response Body
```
[{
   "id": "1",
   "playerName": "Lakin Lane",
   "games": [
      { 
         "id": "1",
         "playerName": "Lakin Lane",
         "score": 145,
         "date": "2017-10-20T04:00:00.000+0000"
      },
      {
         "id": "2",
         "playerName": "Lakin Lane",
         "score": 120,
         "date": "2017-10-20T04:00:00.000+0000"
      }
   ]
}]
```
### POST Player Game by ID via /player/{id}/game

Response Body
```
[{
     "id": "1",
     "playerName": "Lakin Lane",
     "score": 145,
     "date": "2017-10-20T04:00:00.000+0000"
}]
```
### PUT Update Player Archive by ID via /player/{id}/archive

Response Body
```
[{
   "id": "1",
   "playerName": "Lakin Lane",
   "games": [
      { 
         "id": "1",
         "playerName": "Lakin Lane",
         "score": 145,
         "date": "2017-10-20T04:00:00.000+0000"
      } ]
}]
```

### POST Add a game to Player Archive via /player/{id}/archive

Response Body
```
[{
   "id": "42",
   "playerName": "Lakin Lane",
   "score": 150,
   "date": 2018-02-21T00:00:00.000+0000"
}]
```
### DELETE Player Archive by ID via /player/{id}/archive

```No Response Body```

This updates the players average and max score if necessary
>>>>>>> 81a79be27572370f004df986b85b78c4f2e7d912

####Headers set to

Key: Content-type Value: application/json