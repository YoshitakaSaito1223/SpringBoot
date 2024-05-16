package com.example.demo20240509;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

	@Autowired
	PersonRepository personRepository;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO 自動生成されたメソッド・スタブ

		System.out.println("コマンドラインランナー実行開始");
		
		personRepository.save(new Person("アウグストゥス", 75, "ローマ"));
		personRepository.save(new Person("ティベリウス", 77, "ローマ"));
		personRepository.save(new Person("カリグラ", 29, "アンティオキア"));
		personRepository.save(new Person("クラウディウス", 63, "リュブス"));
		personRepository.save(new Person("ネロ", 30, "アンティウム"));
		personRepository.save(new Person("ヴェスパシアヌス", 69, "ファルス"));
		personRepository.save(new Person("ティトゥス", 41, "ローマ"));
		personRepository.save(new Person("ドミティアヌス", 44, "ローマ"));
		personRepository.save(new Person("ネルウァ", 69, "ニクティア"));
		personRepository.save(new Person("トラヤヌス", 63, "イタリア"));
		personRepository.save(new Person("ハドリアヌス", 62, "イタリア"));
		personRepository.save(new Person("アントニヌス・ピウス", 74, "ローマ"));
		personRepository.save(new Person("マルクス・アウレリウス", 58, "ローマ"));
		personRepository.save(new Person("コンモドゥス", 31, "ラヌヴィウム"));
		personRepository.save(new Person("セプティミウス・セウェルス", 65, "リクテル"));
		personRepository.save(new Person("カラカラ", 29, "リュブス"));
		personRepository.save(new Person("エルガバルス", 18, "ローマ"));
		personRepository.save(new Person("アレクサンデル・セウェルス", 26, "アルカス"));
		personRepository.save(new Person("マクシミヌス・トラク", 62, "トラキア"));
		personRepository.save(new Person("ガッバ", 44, "アルカス"));
		personRepository.save(new Person("アウグストゥス", 75, "ローマ"));
		personRepository.save(new Person("ティベリウス", 77, "ローマ"));
		personRepository.save(new Person("カリグラ", 29, "アンティオキア"));
		personRepository.save(new Person("クラウディウス", 63, "リュブス"));
		personRepository.save(new Person("ネロ", 30, "アンティウム"));
		personRepository.save(new Person("ヴェスパシアヌス", 69, "ファルス"));
		personRepository.save(new Person("ティトゥス", 41, "ローマ"));
		personRepository.save(new Person("ドミティアヌス", 44, "ローマ"));
		personRepository.save(new Person("ネルウァ", 69, "ニクティア"));
		personRepository.save(new Person("トラヤヌス", 63, "イタリア"));
		personRepository.save(new Person("ハドリアヌス", 62, "イタリア"));
		personRepository.save(new Person("アントニヌス・ピウス", 74, "ローマ"));
		personRepository.save(new Person("マルクス・アウレリウス", 58, "ローマ"));
		personRepository.save(new Person("コンモドゥス", 31, "ラヌヴィウム"));
		personRepository.save(new Person("セプティミウス・セウェルス", 65, "リクテル"));
		personRepository.save(new Person("カラカラ", 29, "リュブス"));
		personRepository.save(new Person("エルガバルス", 18, "ローマ"));
		personRepository.save(new Person("アレクサンデル・セウェルス", 26, "アルカス"));
		personRepository.save(new Person("マクシミヌス・トラク", 62, "トラキア"));
		personRepository.save(new Person("ガッバ", 44, "アルカス"));
		
		//全検索
		List<Person> list=personRepository.findAll();
		
//		//削除
//		for (Person p:list) {
//			
//			if(p.getId()%2==0) {
//				personRepository.delete(p);
//			}
//			
//			if(p.getName().equals("マルクス・アウレリウス")) {
//				p.setName("マルクス・アウレリウス・アントニヌス");
//				personRepository.save(p);
//			}
//			System.out.println(p.toString());
//		}
//		
//		//IDで削除
//		personRepository.deleteById(1);
//		
//		personRepository.updateName("マルクス・アウレリウス・アントニヌス", "マルクス・アウレリウス");
//		
//		personRepository.updateAddress("ローマ", "Rome");
		
		
		System.out.println("コマンドラインランナー実行終了");
	}

}
