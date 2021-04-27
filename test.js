var table = ["SI JAVA JAVASCRIPT SQL PYTHON C#", "CONTENTS JAVASCRIPT JAVA PYTHON SQL C++", "HARDWARE C C++ PYTHON JAVA JAVASCRIPT", "PORTAL JAVA JAVASCRIPT PYTHON KOTLIN PHP", "GAME C++ C# JAVASCRIPT C JAVA"];
var languages = ["JAVA", "JAVASCRIPT"];
var preference = [7, 5];

function rating(result, si, contents, hardware, portal, game, curLanguages, curPreference) {
    // SI
    for (var j = 1; j < si.length; j++) {
        if (si[j] === curLanguages) {
            result[0] += (6 - j) * curPreference;
        }
    }
    //CONTENTS
    for (var j = 1; j < contents.length; j++) {
        if (contents[j] === curLanguages) {
            result[1] += (6 - j) * curPreference;
        }
    }
    //HARDWARE
    for (var j = 1; j < hardware.length; j++) {
        if (hardware[j] === curLanguages) {
            result[2] += (6 - j) * curPreference;
        }
    }
    //PORTAL
    for (var j = 1; j < portal.length; j++) {
        if (portal[j] === curLanguages) {
            result[3] += (6 - j) * curPreference;
        }
    }
    //GAME
    for (var j = 1; j < game.length; j++) {
        if (game[j] === curLanguages) {
            result[4] += (6 - j) * curPreference;
        }
    }
}

function solution(table, languages, preference) {

    var tempTable = table.sort();

    console.log(tempTable);

    var si = table[0].toString().trim().split(' ');
    var contents = table[1].toString().trim().split(' ');
    var hardware = table[2].toString().trim().split(' ');
    var portal = table[3].toString().trim().split(' ');
    var game = table[4].toString().trim().split(' ');

    var result = [0, 0, 0, 0, 0];

    for (var i = 0; i < languages.length; i++) {

        var curLanguages = languages[i];
        var curPreference = preference[i]

        if (curLanguages === 'JAVA') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'JAVASCRIPT') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'SQL') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'PYTHON') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'C#') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'C++') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'KOTLIN') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
        else if (curLanguages === 'PHP') {
            rating(result, si, contents, hardware, portal, game, curLanguages, curPreference)
        }
    }

    console.log(result);

    var val = Math.max.apply(null, result);

    for (var i = 0; i < tempTable.length; i++) {
        if (val === result[i]) {
            return tempTable[i].toString().trim().split(' ')[0];
        }
    }

    //return Math.max.apply(null, result);
}




class Queue {
    constructor() {
        this._arr = [];
    }
    enqueue(item) {
        this._arr.push(item);
    }
    dequeue() {
        return this._arr.shift();
    }
    size() {
        return this._arr.length;
    }
    front() {
        return this._arr[0];
    }
    print() {
        this.size();
        return 'hoel';
    }
}


// 최댓값 Math.max.apply(null, 배열);

console.log('최종답: ' + solution(table, languages, preference));