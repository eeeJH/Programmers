var test1 = "AaTa+!12-3";
var test2 = "aaaaZZZZ)";
var test3 = "CaCbCgCdC888834A";
var test4 = "UUUUU";
var test5 = "ZzZz9Z824!";

// 1. 8 ≤ password 길이 ≤ 15

// 2. password는 아래 4 종류의 문자 그룹을 제외한, 다른 어떤 문자도 포함해서는 안됩니다.
//   [1] 알파벳 대문자(A~Z)
//   [2] 알파벳 소문자(a~z)
//   [3] 숫자(0~9)
//   [4] 특수문자(~!@#$%^&*)

// 3. password는 (2.)에서 명시된 4 종류의 문자 그룹 중에서 3 종류 이상을 포함해야 합니다.
// 4. password에 어떤 문자라도 같은 문자가 4개 이상 연속될 수 없습니다.
// 5. password에 어떤 문자라도 같은 문자가 5개 이상 포함될 수 없습니다.

function passwordCheck(inp_str) {
    var check = false;

    if (inp_str.length >= 8 && inp_str.length <= 15) {
        check = true;
    }

    return check ? 0 : 1;
}
function wordCheck(inp_str) {
    var check = true;

    var special = /[~!@#$%^&*]/gi;
    var checkNum = /[0-9]/;
    var checkEng = /[a-zA-Z]/;

    for (var i = 0; i < inp_str.length; i++) {

        if (checkNum.test(inp_str[i]) || checkEng.test(inp_str[i])) {
            continue;
        }

        if (special.test(inp_str[i])) {

        } else {
            check = false;
            break;
        }
    }

    return check ? 0 : 1;
}

function wordIncludeCheck(inp_str) {
    var check = true;
    var checkSum = 0;

    var upperCase = false;
    var lowerCase = false;
    var specialBool = false;

    var special = /[~!@#$%^&*]/gi;
    var checkNum = /[0-9]/;
    var checkEng = /[a-zA-Z]/;


    if (checkNum.test(inp_str)) {
        checkSum += 1;
    }

    if (checkEng.test(inp_str[i])) {
        checkSum += 1;
    }


    for (var i = 0; i < inp_str.length; i++) {

        if (checkEng.test(inp_str[i])) {

            if (!upperCase) {
                if (isCapital(inp_str[i])) {
                    upperCase = true;
                }
            }

            if (!lowerCase) {
                if (!isCapital(inp_str[i])) {
                    lowerCase = true;
                }
            }

            continue;
        }

        if (special.test(inp_str[i])) {
            specialBool = true;
        }
    }




    return check ? 0 : 1;
}

function isCapital(string) {
    return string.charAt(0) === string.charAt(0).toUpperCase();
}

function word4Check(inp_str) {
    var check = true;

    return check ? 0 : 1;
}
function wordSame5Check(inp_str) {
    var check = true;

    return check ? 0 : 1;
}

function solution(inp_str) {
    var answer = [];

    if (passwordCheck(inp_str))
        answer.push(1);

    if (wordCheck(inp_str))
        answer.push(2);

    if (wordIncludeCheck(inp_str))
        answer.push(3);

    if (word4Check(inp_str))
        answer.push(4);

    if (wordSame5Check(inp_str))
        answer.push(5);

    answer.sort();

    if (answer.length === 0) {
        var temp = ['0'];
        return temp;
    }

    return answer;
}


console.log('최종답: ' + solution(test5));