# TuckerMillerDevWebApi
## Java Springboot Application
## Utilizing a Cloud Hosted database through Mongodb mLab

Please visit http://api.TuckerMillerDev.com/ For full documentation

### GET ~ All Players
api.TuckerMillerDev.com/players

    [{
      "username":"tdmiller",
      "password":"1234",
      "playerName":"Tucker Miller",
      "average":120,
      "max":165
    }]
    
### GET ~ Single Player
api.TuckerMillerDev.com/players/{username}

    {
      "username":"tdmiller",
      "password":"1234",
      "playerName":"Tucker Miller",
      "average":120,
      "max":165
    }
    
    
### PUT ~ Update Player
api.TuckerMillerDev.com/players/{username}

    {
      "username":"tdmiller",
      "password":"1234",
      "playerName":"Tucker Miller",
      "average":120,
      "max":165
    }
    
    
### POST ~ All Players
api.TuckerMillerDev.com/players/Password

    {
      "username":"tdmiller",
      "password":"1234",
      "playerName":"Tucker Miller",
      "average":120,
      "max":165
    }
    
    
### Delete ~ Player
api.TuckerMillerDev.com/players/Password/{username}

[No Response]


### GET ~ All Records
api.TuckerMillerDev.com/record

    [{
    "username": "tdmiller",
    "games": [
        {
            "id":"1",
            "score":120,
            "date":"2019-04-12T00:00:00.000+0000"
        },
        {
            "id":"2",
            "score":120,
            "date":"2019-04-12T00:00:00.000+0000"
        }
      ]
    },
    {
        "username": "newPerson",
        "games": [
        {
            "id":"1",
            "score":120,
            "date":"2019-04-12T00:00:00.000+0000"
        },
        {
            "id":"2",
            "score":120,
            "date":"2019-04-12T00:00:00.000+0000"
        }
      ]
    }
        
### GET ~ All one player record
api.TuckerMillerDev.com/record/{username}

{
    "username": "newPerson",
    "games": [
      {
          "id":"1",
          "score":120,
          "date":"2019-04-12T00:00:00.000+0000"
      },
      {
          "id":"2",
          "score":120,
          "date":"2019-04-12T00:00:00.000+0000"
      }
    ]
}

### PUT ~ Update one record
api.TuckerMillerDev.com/record/{username}

{
    "username": "newPerson",
    "games": [
      {
          "id":"1",
          "score":120,
          "date":"2019-04-12T00:00:00.000+0000"
      },
      {
          "id":"2",
          "score":120,
          "date":"2019-04-12T00:00:00.000+0000"
      }
    ]
}

### POST ~ Create one reocord
api.TuckerMillerDev.com/record/Password

{
    "username": "newPerson",
    "games": [
      {
          "id":"1",
          "score":120,
          "date":"2019-04-12T00:00:00.000+0000"
      },
      {
          "id":"2",
          "score":120,
          "date":"2019-04-12T00:00:00.000+0000"
      }
    ]
}

### Delete ~ Record
api.TuckerMillerDev.com/players/Password/{username}

[No Response]
