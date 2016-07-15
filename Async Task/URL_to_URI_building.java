
			int params = 94043;
			String format = "json";
            String units = "metric";
            int numDays = 7;
            String apiKey = "ebkaf7a042726c3517d41db2153e"


final String FORECAST_BASE_URL =
                        "http://api.openweathermap.org/data/2.5/forecast/daily?";
                final String QUERY_PARAM = "q";
                final String FORMAT_PARAM = "mode";
                final String UNITS_PARAM = "units";
                final String DAYS_PARAM = "cnt";
                final String APPID_PARAM = "APPID";

                Uri builtUri = Uri.parse(FORECAST_BASE_URL).buildUpon()
                        .appendQueryParameter(QUERY_PARAM, Integer.toString(params))
                        .appendQueryParameter(FORMAT_PARAM, format)
                        .appendQueryParameter(UNITS_PARAM, units)
                        .appendQueryParameter(DAYS_PARAM, Integer.toString(numDays))
                        .appendQueryParameter(APPID_PARAM, apiKey)
                        .build();

                URL url = new URL(builtUri.toString());

                 Log.v(LOG_TAG, "Built URI " + builtUri.toString());
