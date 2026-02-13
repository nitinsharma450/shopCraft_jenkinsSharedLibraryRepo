def call(){
echo 'building docker container'
  docker compose down && docker compose up --build
echo 'container build successfully'
}
