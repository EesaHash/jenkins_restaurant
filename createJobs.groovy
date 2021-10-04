pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('eRestaurant Spring Boot Web Application') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/EesaHash/eRestaurant-Manager.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}