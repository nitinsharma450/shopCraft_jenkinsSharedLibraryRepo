def call() {
    echo 'Building Docker container...'

    sh '''
        docker compose down || true
        docker compose up --build -d
    '''

    echo 'Container built successfully.'
}

