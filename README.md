# JavaEE7Education
JavaEE研修用リポジトリ

## Wildflyの管理コンソール
http://www.javadera.com/other/wildfly-8-x-%E7%AE%A1%E7%90%86%E3%83%A6%E3%83%BC%E3%82%B6%E8%BF%BD%E5%8A%A0/

## JPAについて

### MySQLドライバデプロイ方法
MySQLのドライバは`wildfly-8.2.1.Final\standalone\deployments`へ配備
(Web上でもデプロイできるが、何度か削除されてしまうため)

### データソース
Wildflyの管理コンソールから作成
(**-ds.xml)は作成していないが、今後データソース絡みでトラブルが頻発するようであれば考慮

### MySQLの文字コード
my.cnfの設定追加とデータベース作成時に考慮が必要

#### my.cnf
```
sudo vi /etc/my.cnf
```
```
[client]
default-character-set=utf8
```
を追加

#### データベース作成
```
CREATE DATABASE educattion_book DEFAULT CHARACTER SET utf8
```
