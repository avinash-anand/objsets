import objsets.{NonEmpty, Tweet, TweetSet}

val x: Seq[Int] = Nil
x.filter(_ > 0)// so the expected behaviour is still return Nil
//class test(elem: Tweet, left: TweetSet, right: TweetSet) extends NonEmpty(elem: Tweet, left: TweetSet, right: TweetSet) {
//  override def filterAcc(p: Tweet => Boolean, acc: TweetSet): TweetSet = {
//    if(p(elem)) this.remove(elem).filterAcc(p, acc.incl(elem))
//    else this.remove(elem).filterAcc(p, acc)
//  }
//}
