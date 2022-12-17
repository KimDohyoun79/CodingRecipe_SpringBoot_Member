# CodingRecipe_SpringBoot_Member


[코딩레시피 : 회원](https://www.youtube.com/watch?v=RhM1bQ76Tv0&list=PLV9zd3otBRt5ANIjawvd-el3QU594wyx7&index=1)


- 스프링부트 복습을 위해 문제 해결 후 강의 확인 및 비교
- [SpringBoot] + [MariaDB] + [thymeleaf] + [JPA] 사용

<br>

---
<br>

- [완료] 3. application.yml 설정
- [완료] 4. 기본 주소 요청
- [완료] 5. 회원가입 페이지 요청
- [완료] 6. 회원가입 : 입력한 정보 콘트롤러로 전달
- [완료] 7. 회원가입 : DB 연동 및 Entity, Repository, Service, DI
  - [@RequiredArgsConstructor](https://velog.io/@developerjun0615/Spring-RequiredArgsConstructor-%EC%96%B4%EB%85%B8%ED%85%8C%EC%9D%B4%EC%85%98%EC%9D%84-%EC%82%AC%EC%9A%A9%ED%95%9C-%EC%83%9D%EC%84%B1%EC%9E%90-%EC%A3%BC%EC%9E%85)
  - `@ModelAttribute` 
- [완료] 8. 회원가입 : Service(DTO, Entity)
  - `MemberEntity memberEntity = MemberEntity.toMemberEntity(memberDTO);`
- [완료] 9. 로그인
- [완료] 10. 회원목록 출력
- [완료] 11. 회원정보 상세조회
  - `<input type="hidden" name="id" th:value="${memberDTO.id}"/>`
- [완료] 12. 회원정보 수정
- [완료] 13. 회원 삭제













