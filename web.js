window.onload = function(){
    school = prompt('학교를 입력해주세요.');
    if(school == '서울과학기술대학교')
        alert('환영합니다.');
    else
        alert('방문을 환영합니다.')

var button = document.getElementById("my_button");

button.addEventListener("click", function(event){
    alert("1을 누르면 메인으로 돌아옵니다. \n2를 누르면 네이버로 이동합니다. \n3을 누르면 사진이 뜨는 페이지로 이동합니다.");
});
}


