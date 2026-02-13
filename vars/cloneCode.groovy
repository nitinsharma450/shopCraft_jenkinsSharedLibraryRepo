def call(String url, String branch){
   echo 'Fetching code from GitHub'
   git branch:branch, url:url
   echo 'Code cloned successfully'
}
