def call(){
echo 'building docker container'
 sh docker compose down && docker compose up --build
echo 'container build successfully'
}
