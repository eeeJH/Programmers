var program = "line";
var flag_rules = ["-s STRING", "-n NUMBER", "-e NULL"];
var commands = ["line -n 100 -s hi -e", "lien -s Bye"];



var program1 = "line";
var flag_rules1 = ["-s STRINGS", "-n NUMBERS", "-e NULL"];
var commands1 = ["line -s 123 -n HI", "line fun"];


function solution(program, flag_rules, commands) {
    var answer = [];

    var cli = program;
    var flag_argument_type = [];

    for (var i = 0; i < flag_rules.length; i++) {

        var temp = flag_rules[i].toString().trim().split(' ');
        temp[0] = temp[0].substring(1);

        flag_argument_type.push(temp);
    }

    //flag_type.push(flag_argument_type[i]);
    // "NULL": flag argument를 받지 않습니다.
    // "NUMBER": 0부터 9까지의 숫자로만 이루어진 flag argument를 받습니다.
    // "STRING": 알파벳 대소문자로만 이루어진 flag argument를 받습니다.

    console.log(flag_argument_type);

    console.log('commands :: ' + commands);


    for (var i = 0; i < commands.length; i++) {

        var result = true;

        console.log('commands[' + i + '] :: ' + commands[i]);

        console.log('program :: ' + commands.toString().trim().split(' ')[i]);

        if (commands.toString().trim().split(' ')[i] === cli) {

            if (commands[i].indexOf('\-') === -1) {
                console.log('NOT EXIST!');
                result = false;
            } else {

                var command = commands[i].toString().trim().split('-');

                console.log('command :: ' + command);

                for (var j = 1; j < command.length; j++) {

                    console.log(command[j].toString().trim());

                    var curCommand = command[j].toString().trim().split(' ');
                    var curCommandInput;
                    console.log('curCommand :: ' + curCommand);

                    for (var z = 0; z < flag_argument_type.length; z++) {
                        if (curCommand[0].toString().trim() === flag_argument_type[z][0]) {
                            curCommandInput = flag_argument_type[z][1];
                            break;
                        }
                    }

                    console.log('curCommandInput :: ' + curCommandInput);

                    switch (curCommandInput) {
                        case 'STRING':

                            var curCommandData = [];

                            for (var k = 1; k < curCommand.length; k++) {
                                curCommandData.push(curCommand[k]);
                            }

                            console.log('curCommandData :: STRING ' + curCommandData);

                            if (curCommandData.length > 1) {
                                result = false;
                                break;
                            }

                            if (!isNaN(curCommandData)) {
                                console.log(i + ' i :: STRING ' + commands[i]);
                                result = false;
                            }

                            break;



                        case 'NUMBER':
                            var curCommandData = [];

                            for (var k = 1; k < curCommand.length; k++) {
                                curCommandData.push(curCommand[k]);
                            }

                            console.log('curCommandData :: NUMBER ' + curCommandData);

                            if (curCommandData.length > 1) {
                                result = false;
                                break;
                            }

                            if (isNaN(curCommandData)) {
                                console.log(i + ' i :: NUMBER ' + commands[i]);
                                result = false;
                            }

                            break;



                        case 'NULL':

                            if (curCommand.length > 1) {
                                console.log(i + ' i :: NULL ' + commands[i]);
                                result = false;
                            }

                            break;

                        default:
                            console.log('NOT EXIST');
                            result = false;
                            break;
                    }

                    if (!result) {
                        console.log('false!!!!!!!!!!');
                        break;
                    }

                }
            }

        }
        else {
            console.log(i + ' i :: program ' + commands[i]);
            result = false;
        }


        answer.push(result);
    }


    console.log(answer);

    return answer;
}


solution(program, flag_rules, commands);