namespace java thrift.test

enum PersonKind
{
  /**
   * 友人
   */
  FRIEND,

  /**
   * 知人
   */
  ACQUAINTANCE,

  /**
   * 変な人
   */
  STRANGER;

}

struct Greeting
{
  1: string message;
}

exception TIllegalArgumentException
{
  1: string code;
  2: string message;
  3: string detail;
}

service GreetingService
{

  Greeting greetingFor(1: PersonKind kind) throws (1: TIllegalArgumentException e);

}
