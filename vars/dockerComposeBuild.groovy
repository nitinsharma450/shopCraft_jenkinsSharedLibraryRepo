def call() {
    echo 'Building Docker container...'

    sh '''
       echo 'removing container'
        docker compose down || true
        docker compose up --build -d
    '''

    echo 'Container built successfully.'
}

