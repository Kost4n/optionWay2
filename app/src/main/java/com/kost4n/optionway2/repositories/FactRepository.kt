package com.kost4n.optionway2.repositories

import android.util.Log
import com.kost4n.optionway2.utilits.Fact
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.launch
import org.jsoup.Jsoup

class FactRepository {

    fun getFacts(): List<Fact> {
        val list = mutableListOf<Fact>()
        list.add(Fact("1. Basketball is a game that has no analogues in the modern world. Basketball is an exciting activity that develops strength, agility and speed in a person. Modern basketball was invented at the end of the XIX century, as an improved youth gymnastics."))
        list.add(Fact("2. For almost a century and a half of history, this sport has remained virtually unchanged and has become overgrown with myths."))
        list.add(Fact("3. The oldest predecessor of basketball is the Mesoamerican ball game, often combined with celebrations of ritual sacrifices."))
        list.add(Fact("4. Basketball is one of the most popular games in the USA and was invented by an American."))
        list.add(Fact("5. In 1891, James Naismith, a Canadian by birth, who worked as a college teacher in the United States, suggested that students play team on team instead of gymnastics. He tied baskets of peaches to the balconies in the gym and said that the players should throw the ball into the opponent's basket. The winner will be the one who throws the most times."))
        list.add(Fact("6. In January of the following year, he also published the rules of the basketball game in a local newspaper. It began to spread rapidly among students of other educational institutions. Popularity grew at a furious pace, clubs and associations appeared.\n"))
        list.add(Fact("7. The first professional basketball match took place in Canada, in Toronto, in 1946."))
        list.add(Fact("8. The first basketball baskets were still peach baskets and their bottoms were not open until 1913. Up to this point, the referee used a ladder to get the ball after each hit."))
        list.add(Fact("9. At first, basketball was played with a soccer ball. A real basketball appeared only in 1929."))
        list.add(Fact("10. At first, the basketball was brown. In the 1950s, it became orange. Now sometimes they even play with colorful balls."))
        list.add(Fact("11. Before World War II, basketball was popular only in the USA. After the war, he was recognized all over the world."))
        list.add(Fact("12. And in the 1980s, there was an explosion in the popularity of the game thanks to television."))
        list.add(Fact("13. Why did the shield appear? Therefore, at the dawn of the game's development, fans on the balcony often caught the ball."))
        list.add(Fact("14. Professional basketball shields are made of tempered glass, which, however, does not prevent especially passionate players from sometimes smashing them into a ringing crumb.\n"))
        list.add(Fact("15. Basketball became an Olympic sport in 1936 in Berlin. 23 teams participated, and in the final, the U.S. team defeated the Canadian team with a score of 19-8."))
        list.add(Fact("16. There are currently only two teams in the NBA that have been around since the beginning. These are the Boston Celtics and the New York Knicks."))
        list.add(Fact("17. The statement that you cannot become a basketball player if you are less than 2 meters tall is incorrect. Over 30% of NBA players are under 170 centimeters tall."))
        list.add(Fact("18. Naismith came up with the rules, which were then gradually supplemented and changed."))
        list.add(Fact("19. However, they started playing by similar rules long before that. The Indians loved \"pok-ta-pok\", the purpose of which was to send a rubber ball into a ring carved in the wall. Legend has it that the winning team was immediately beheaded as a sacrifice to the gods. Moreover, it was very honorable for the winners."))
        list.add(Fact("20. The first official game was held in the Russian Empire in 1906, but the special development of this sport was during the Soviet Union."))
        list.add(Fact("21. The game cannot be called traditionally Russian, so it was difficult to beat the ancestors, the Americans."))
        list.add(Fact("22. But it still happened in the scandalous final at the 1972 Olympics. When, after a mistake by the referee, who did not play with the clock, they had to add 3 seconds to the match, although it was already over, and the Americans celebrated gold medals. In the added seconds, the Soviet basketball players were able to throw the ball and eventually won the match with a difference of 1 point."))
        list.add(Fact("23. There were also scandals in basketball. The first athlete who was banned from participating in official matches was Mahmoud Abdul-Rauf. He was suspended for refusing to listen to the national anthem standing up."))
        list.add(Fact("24. Another interesting case is connected with the legendary Michael Jordan, who came to the award ceremony wrapped in the US flag. Everything would have been fine, but it turned out that he was hiding the Reebok sportswear he was wearing under the flag, since he had a personal contract with Nike."))
        list.add(Fact("25. Tim Duncan was supposed to compete in swimming for the USA at the Olympics. But before the training camp, a hurricane destroyed the pool, and the team was forced to train on open water in the ocean. But Tim was scared to death of sharks, so he decided that he would keep fit by playing basketball. As a result, Duncan became a famous basketball player."))
        list.add(Fact("26. Basketball star Shaquille O'Neal managed to throw a three-point shot just once during his professional career."))
        list.add(Fact("27. When there are loopholes in the rules, and players use them due to individual characteristics, not everyone likes it. In 1967, the National Basketball Association (NBA) banned the \"slam dunk\" - a throw from above, when a player literally put the ball into the basket in a jump."))
        list.add(Fact("28. At that time it was successfully applied by Kareem Abdul-Jabbar. The association decided that because of this, his team gets an advantage over others and banned throws from above. However, after 9 years, slam dunk was allowed again because of its beauty in performance."))
        list.add(Fact("29. Abdul-Jabbar is considered the most productive basketball player. He scored about 40,000 points in 20 seasons."))
        list.add(Fact("30. The Boston Celtics club became the NBA champion 17 times, which is an absolute record in comparison with other clubs."))
        list.add(Fact("31. Michael Jordan is the best basketball player on the planet and one of the most famous athletes."))
        list.add(Fact("32. Here are some of his records: 30.12 points per game throughout his career; 11 seasons with the best score; 563 matches in which he scored more than 30 points; 8 seasons in which he scored more than 30 points per game; 893 blocked shots."))
        list.add(Fact("33. Earl Loyd is the first black athlete to play in the NBA. It happened in 1950, the Washington Capitals team."))
        list.add(Fact("34. The rules differ depending on the country. For example, the Koreans distinguished themselves as usual. According to the classical rules, 3 points are given for a hit from a long distance, 2 points from the usual one, 1 point from the penalty line."))
        list.add(Fact("35. And in North Korea, a long–range hit is valued at 4 points, a successful throw from above is 3 points, any hit in the last 3 minutes of the match brings 8 points. It also provides for the deduction of points in case of an unsuccessful execution of a free throw. It seems that such a rule change is unacceptable, but it makes the game more dynamic and spectacular."))
        list.add(Fact("36. The tallest basketball player in history was Suleiman Ali Nashnun (Libya) with a height of 245 centimeters, and the shortest was Magsi Bogz (USA) with a height of 160 centimeters. Moreover, this did not particularly bother him, since, among other things, speed and agility are also important."))
        list.add(Fact("37. In the middle of the XX century, streetball emerged from basketball. He became quite popular. This is a street version of basketball, when teams are 3 on 3 and try to throw the ball, playing at the same ring."))
        list.add(Fact("38. In 1974, Pete Maravich gave an interview where he said that he was not going to lose 10 years of basketball, and then die at the age of 40 from a heart attack. Pete's professional career lasted just 10 years, after which he died of an attack at the age of 40."))
        list.add(Fact("39. Some people think that if they play basketball, they will become taller."))
        list.add(Fact("40. According to statistics, basketball players get half as many injuries as cheerleaders, without whose performances almost no competition in the United States can do."))
        list.add(Fact("41. The most successful Soviet basketball player is Latvian Yanis Krumishin. He started playing late, at the age of 23, but already at the age of 25 he won the USSR championship, and at the age of 26 he became an Olympic medalist."))
        list.add(Fact("42. The record of points scored in one match belongs to Wilt Chamberlain, who scored 100 points in a personal score. To be clear, sometimes even the whole team can't score more than 100 in a match."))
        list.add(Fact("43. Basketball techniques received qualitative development and diversity only after the shape of the ball was changed from round to spherical. The size and weight of the balls vary for women, men, teenagers and children."))
        list.add(Fact("44. These Rules of basketball (over 200!) are based on 13 principles of the game formulated in the same distant period. NBA members must follow certain rules, including the association sets a dress code for players. It can even regulate the color of socks, but some rules are strictly practical. For example, the ban on wearing earrings and chains on the basketball court is explained by the risk of injury."))
        list.add(Fact("45. In case of bruising or stretching during a basketball match, it is necessary to immediately apply ice to the injury site or treat it with sports freezing."))
        list.add(Fact("46. Basketball is included in the physical education program in schools almost all over the world. And this is not to educate professional players."))
        list.add(Fact("47. It's just that many children like this game, it is mobile, develops strength, speed, agility. Unlike football and volleyball, basketball is enjoyed by both boys and girls."))
        list.add(Fact("48. And in some countries basketball really gives students a profession for the future. For example, in the USA, Lithuania, Spain, Serbia, Greece – traditionally \"basketball\" countries."))
        list.add(Fact("49. Basketball is famous for spectacular throws and fighting to the last second under the roar of the audience."))
        list.add(Fact("50. Basketball is loved all over the world, the players are very famous, receive large fees, and the game itself has long turned into a business."))

        return list
    }
}