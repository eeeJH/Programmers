# ***LEVEL 2***



## 고양이와 개는 몇 마리 있을까

```sql
SELECT ANIMAL_TYPE, COUNT(*) count
FROM ANIMAL_INS 
GROUP BY ANIMAL_TYPE 
ORDER BY ANIMAL_TYPE;
```



## 루시와 엘라 찾기

```sql
SELECT ANIMAL_ID, NAME, SEX_UPON_INTAKE
FROM ANIMAL_INS
WHERE NAME = 'Lucy' || NAME = 'Ella' || NAME = 'Pickle' || NAME = 'Rogan' || NAME = 'Sabrina' || NAME = 'Mitty';
```



## 최솟값 구하기

```sql
SELECT MIN(DATETIME)
FROM ANIMAL_INS;
```



## 동명 동물 수 찾기

```sql
SELECT NAME, COUNT(NAME) COUNT
FROM ANIMAL_INS
WHERE NAME IS NOT null
GROUP BY NAME
HAVING COUNT(NAME) > 1
ORDER BY NAME;
```



## 이름에 el이 들어가는 동물 찾기

```sql
SELECT ANIMAL_ID, NAME
FROM ANIMAL_INS
WHERE NAME LIKE '%el%' && ANIMAL_TYPE = 'Dog'
ORDER BY NAME;
```



## 중성화 여부 파악하기

```sql
SELECT ANIMAL_ID, NAME, if(SEX_UPON_INTAKE like '%Neutered%' || SEX_UPON_INTAKE like '%Spayed%', 'O', 'X') '중성화' 
FROM ANIMAL_INS
ORDER BY ANIMAL_ID
```



## NULL 처리하기

```sql
SELECT ANIMAL_TYPE, IFNULL(NAME, 'No name'), SEX_UPON_INTAKE 
FROM ANIMAL_INS;
```



## 동물 수 구하기

```sql
SELECT COUNT(*)
FROM ANIMAL_INS;
```



## 입양 시각 구하기(1)

```sql
SELECT HOUR(DATETIME) AS HOUR, COUNT(*) AS COUNT
FROM ANIMAL_OUTS
WHERE HOUR(DATETIME) BETWEEN 9 AND 19
GROUP BY HOUR
ORDER BY HOUR;
```



## 중복 제거하기

```sql
SELECT SUM(A.NA)
FROM
(
    SELECT 1 NA
    FROM ANIMAL_INS
    WHERE NAME IS NOT NULL
    GROUP BY NAME
)A;
```



## DATETIME에서 DATE로 형 변환

```sql
SELECT ANIMAL_ID, NAME, DATE_FORMAT(DATETIME, '%Y-%m-%d') '날짜'
FROM ANIMAL_INS
ORDER BY ANIMAL_ID;
```

대소문자 구별

%y = 12, 14 등으로 표시

%Y = 2012, 2014 등으로 표시

%m = 01, 02, 12 등으로 표시

%M = January, February, December 등으로 표시

%d = 01, 02, 03 등으로 표시

%D = 1st, 2nd, 3rd 등으로 표시

