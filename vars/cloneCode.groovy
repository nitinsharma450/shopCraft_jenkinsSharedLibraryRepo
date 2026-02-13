def call(String url,String branch){
  echo 'fetching code from github'
  git clone url:url, branch:branch
  echo 'code fetch successfully'
}
