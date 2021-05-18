/*----------------------------------------------------------------------------
				1 ~10 까지의 소수의 합 구하기

				*입사 시험문제
			----------------------------------------------------------------------------*/
            //소수: 1과 자기 자신으로만 나누어 떨어지는 수.
            // let total = new Array(10);
            // for(let i=1;i<=10;i++){
            //     //document.write(i);
            //     let num = 0;
            //     for(let j=2;j<i;j++){
            //         if(i%j ===0){
                           //여기는 소수가 아닌 수들.
            //             total.push(i);
            //             console.log(total[i]);
            //         }
            //     }
            // }
            // // for(let k=0;k<total.length;k++){
            // //     console.log(total[k]);
            // // }
            // document.write("<br>");

            function primeNumSolution(n) {
                let count = 0;
                let arr1 = new Array();
                for (let i = 2; i <= n; i++) {
                  let isPrimeNum = true;
                  for (let j = 2; j < i; j++) {
                    if (i % j === 0) {
                        isPrimeNum = false;
                    }
                  }
                  if (isPrimeNum) {
                    ++count;
                    arr1.push(i);
                  }
                }
                return arr1;
              }
              console.log(primeNumSolution(10));
              //test1.html의 선택자
            let prime1 = document.querySelector("#prime1");
            //<p>태그를 만들고,
            let p1 = document.createElement("p");
            //<p>내부에 내용물은 소수 함수의 결과물을 넣는다.
            p1.textContent = primeNumSolution(10);
            //그리고 그것을 test1.html의 id=prime1에 삽입.
            prime1.appendChild(p1);



            
			// var tot = 0;
			// for ( var i = 2; i <= 10; i++ ){//나눠지는놈
			// 	num = 0;
			// 	for ( var j = 2; j < i; j++ ){//나누는놈
			// 		if( i%j == 0 ){
			// 			num = num + 1;
			// 		}
			// 	}
			// 	if ( num == 0 )
			// 		{	
			// 			document.write( i + " " );
			// 			tot = tot + i;
			// 		}
			// }
			// document.write( "<br>" );
			// document.write( "1~10까지 소수의 합은 " + tot + "<br>" );
			// document.write( "<hr> " );
							//1과 자기 자신까지 나누는 것을 뺀것	
			//--------------------------------------------------------------------------

				// var sosu =10;
				// for (var i=2; i<=sosu; i++ ){//나눠지는놈
				// 	var cnt=0;
				// 	for (var j=1; j<=i; j++ ){//나누는놈
				// 		if (i%j==0){
				// 			cnt++;
				// 		}
				// 	}
				// 	if (cnt==2){//1과 자기자신을 가지는 숫자 검사
				// 		document.write(i+ " ");
				// 	}
				// }
				// document.write("<hr>");
				// //1과 자기 자신까지 나누는 것을 포함한것(비효율적)