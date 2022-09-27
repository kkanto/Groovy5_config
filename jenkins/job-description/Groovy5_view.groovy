 
listView('Groovy5 Jobs') {
    description('Groovy5 Jobs')
    jobs {
        regex('Groovy5_.+')
    }
    columns {
        status()
        weather()
        name()
        lastSuccess()
        lastFailure()
        lastDuration()
        buildButton()
    }
}
