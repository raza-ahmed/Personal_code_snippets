/* Given JSON data */

{
  "city": {
    "id": 1270642,
    "name": "Gurgaon",
    "coord": {
      "lon": 77.033333,
      "lat": 28.466667
    },
    "country": "IN",
    "population": 0
  },
  "cod": "200",
  "message": 0.016,
  "cnt": 5,
  "list": [
    {
      "dt": 1468562400,
      "temp": {
        "day": 26.53,
        "min": 26.53,
        "max": 26.53,
        "night": 26.53,
        "eve": 26.53,
        "morn": 26.53
      },
      "pressure": 984.14,
      "humidity": 96,
      "weather": [
        {
          "id": 500,
          "main": "Rain",
          "description": "light rain",
          "icon": "10n"
        }
      ],
      "speed": 1,
      "deg": 349,
      "clouds": 88
    },
    {
      "dt": 1468648800,
      "temp": {
        "day": 26.76,
        "min": 25.57,
        "max": 27.64,
        "night": 26.26,
        "eve": 27.03,
        "morn": 26.33
      },
      "pressure": 985.24,
      "humidity": 100,
      "weather": [
        {
          "id": 502,
          "main": "Rain",
          "description": "heavy intensity rain",
          "icon": "10d"
        }
      ],
      "speed": 2.86,
      "deg": 71,
      "clouds": 92,
      "rain": 15.94
    },
    {
      "dt": 1468735200,
      "temp": {
        "day": 27.45,
        "min": 25.18,
        "max": 27.68,
        "night": 25.51,
        "eve": 27.68,
        "morn": 25.18
      },
      "pressure": 988.8,
      "humidity": 0,
      "weather": [
        {
          "id": 502,
          "main": "Rain",
          "description": "heavy intensity rain",
          "icon": "10d"
        }
      ],
      "speed": 4.75,
      "deg": 134,
      "clouds": 24,
      "rain": 35.52
    },
    {
      "dt": 1468821600,
      "temp": {
        "day": 28.39,
        "min": 24.8,
        "max": 29.39,
        "night": 25.4,
        "eve": 29.39,
        "morn": 24.8
      },
      "pressure": 990.59,
      "humidity": 0,
      "weather": [
        {
          "id": 502,
          "main": "Rain",
          "description": "heavy intensity rain",
          "icon": "10d"
        }
      ],
      "speed": 4.2,
      "deg": 204,
      "clouds": 20,
      "rain": 12.34
    },
    {
      "dt": 1468908000,
      "temp": {
        "day": 29.07,
        "min": 24.5,
        "max": 29.07,
        "night": 25.27,
        "eve": 28.45,
        "morn": 24.5
      },
      "pressure": 989.6,
      "humidity": 0,
      "weather": [
        {
          "id": 501,
          "main": "Rain",
          "description": "moderate rain",
          "icon": "10d"
        }
      ],
      "speed": 2.01,
      "deg": 229,
      "clouds": 37,
      "rain": 9
    }
  ]
} 


/* Given JSON data ends */



import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class WeatherDataParser {

	/**
	 * Given a string of the form returned by the api call:
	 * http://api.openweathermap.org/data/2.5/forecast/daily?q=94043&mode=json&units=metric&cnt=7 
	 * retrieve the maximum temperature for the day indicated by dayIndex
	 * (Note: 0-indexed, so 0 would refer to the first day).
	 */
	public static double getMaxTemperatureForDay(String weatherJsonStr, int dayIndex)
		throws JSONException {
		// TODO: add parsing code here
	    
	    JSONObject weather = new JSONObject(weatherJsonStr);
	    JSONArray listVal = weather.getJSONArray("list");
	    JSONObject dayInfo = listVal.getJSONObject(dayIndex);
	    JSONObject temperatureInfo = dayInfo.getJSONObject("temp");
	    return temperatureInfo.getDouble("max");
	    
	}

}