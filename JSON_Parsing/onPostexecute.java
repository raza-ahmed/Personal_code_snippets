/*
onPostExecute method runs on the main thread. Here in this example we 
*/


 protected void onPostExecute(String[] result) {
            if (result != null){
                mForecastAdapter.clear();//Clearing the adapter from the previous data that it might have
                for (String dayForecastStr : result){
                    mForecastAdapter.add(dayForecastStr);//adding the result of the doInbackground method to mForecastAdapter
                }
                
            }
        }