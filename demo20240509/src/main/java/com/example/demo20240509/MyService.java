package com.example.demo20240509;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	PersonRepository personRepository;

	public List<Person> getPersonByFindAll() {
		return personRepository.findAll();
	}

	public List<Person> getPersonByAnyOption(String _nameString, String _addressString, String _ageString, String _idString) {
		int _age = 0, _id = 0;
		String _name=null,_address=null;
		if (!(_ageString.isEmpty()))
			_age = Integer.parseInt(_ageString);
		if (!(_idString.isEmpty()))
			_id = Integer.parseInt(_idString);
		if(!(_nameString.equals("")))
			_name=_nameString;
		if(!(_addressString.equals("")))
			_address=_addressString;

		if (personRepository.findByAny(_name, _address, _age, _id).isEmpty())
			return personRepository.findAll();
		else
			return personRepository.findByAny(_name, _address, _age, _id);
	}

	public ArrayList<Person> getPersonList() {
		ArrayList<Person> people = new ArrayList<Person>();

		people.add(new Person("徳川家康", 5, "江戸城"));
		people.add(new Person("Bさん", 15, "名古屋"));
		people.add(new Person("織田信長", 25, "安土城"));
		people.add(new Person("Dさん", 35, "東京"));
		people.add(new Person("Eさん", 45, "大阪"));
		people.add(new Person("John Doe", 30, "1234 Elm Street"));
		people.add(new Person("Jane Smith", 25, "5678 Oak Street"));
		people.add(new Person("Jim Bean", 35, "9012 Maple Street"));

		return people;
	}

	public ArrayList<Person> getScientists() {
		ArrayList<Person> scientists = new ArrayList<Person>();
		scientists.add(new Person("アルキメデス", 75, "古代ギリシャ"));
		scientists.add(new Person("プトレマイオス", 62, "古代エジプト"));
		scientists.add(new Person("ガリレオ・ガリレイ", 77, "イタリア"));
		scientists.add(new Person("イサク・ニュートン", 84, "イギリス"));
		scientists.add(new Person("レオナルド・ダ・ヴィンチ", 67, "イタリア"));
		scientists.add(new Person("ジョン・ダルトン", 77, "イギリス"));
		scientists.add(new Person("マリー・キュリー", 66, "ポーランド"));
		scientists.add(new Person("アルベルト・アインシュタイン", 76, "ドイツ"));
		scientists.add(new Person("マイケル・ファラデー", 75, "イギリス"));
		scientists.add(new Person("ニコラス・コペルニクス", 70, "ポーランド"));
		scientists.add(new Person("ジョセフ・プリーストリー", 70, "イギリス"));
		scientists.add(new Person("ワーナー・フォン・ブラウン", 65, "ドイツ"));
		scientists.add(new Person("ソクラテス", 71, "古代ギリシャ"));
		scientists.add(new Person("ユーグ・カヴェンディッシュ", 74, "イギリス"));
		scientists.add(new Person("アントニ・ファン・レーウェンフック", 90, "オランダ"));
		scientists.add(new Person("ロバート・フック", 83, "イギリス"));
		scientists.add(new Person("クラウディウス・プトレマイオス", 70, "古代エジプト"));
		scientists.add(new Person("ウィリアム・ハーシェル", 84, "イギリス"));
		scientists.add(new Person("ジェームズ・クラーク・マクスウェル", 48, "イギリス"));
		scientists.add(new Person("アーチャー・ジョン・ポーター・マーティン", 94, "イギリス"));

		return scientists;
	}

	public ArrayList<Person> getRomen() {
		ArrayList<Person> romen = new ArrayList<Person>();
		romen.add(new Person("アウグストゥス", 75, "ローマ"));
		romen.add(new Person("ティベリウス", 77, "ローマ"));
		romen.add(new Person("カリグラ", 29, "アンティオキア"));
		romen.add(new Person("クラウディウス", 63, "リュブス"));
		romen.add(new Person("ネロ", 30, "アンティウム"));
		romen.add(new Person("ヴェスパシアヌス", 69, "ファルス"));
		romen.add(new Person("ティトゥス", 41, "ローマ"));
		romen.add(new Person("ドミティアヌス", 44, "ローマ"));
		romen.add(new Person("ネルウァ", 69, "ニクティア"));
		romen.add(new Person("トラヤヌス", 63, "イタリア"));
		romen.add(new Person("ハドリアヌス", 62, "イタリア"));
		romen.add(new Person("アントニヌス・ピウス", 74, "ローマ"));
		romen.add(new Person("マルクス・アウレリウス", 58, "ローマ"));
		romen.add(new Person("コンモドゥス", 31, "ラヌヴィウム"));
		romen.add(new Person("セプティミウス・セウェルス", 65, "リクテル"));
		romen.add(new Person("カラカラ", 29, "リュブス"));
		romen.add(new Person("エルガバルス", 18, "ローマ"));
		romen.add(new Person("アレクサンデル・セウェルス", 26, "アルカス"));
		romen.add(new Person("マクシミヌス・トラク", 62, "トラキア"));
		romen.add(new Person("ガッバ", 44, "アルカス"));

		return romen;
	}
}
