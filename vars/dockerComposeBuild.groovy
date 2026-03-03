def call() {
    echo 'Building Docker container...'
     echo 'removing container'

    sh '''
      
        docker compose down || true
        docker compose up --build -d
    '''

    echo 'Container built successfully.'
}

