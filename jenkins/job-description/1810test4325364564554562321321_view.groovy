 
listView('1810test4325364564554562321321 Jobs') {
    description('1810test4325364564554562321321 Jobs')
    jobs {
        regex('1810test4325364564554562321321_.+')
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
