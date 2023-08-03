package com.example.test

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        test()
    }
    fun test(){
        val rbvariant1=findViewById<RadioButton>(R.id.rb_variant1)
        val rbvariant2=findViewById<RadioButton>(R.id.rb_variant2)
        val rbvariant3=findViewById<RadioButton>(R.id.rb_variant3)
        val rbvariant4=findViewById<RadioButton>(R.id.rb_variant4)
        val tvtest=findViewById<TextView>(R.id.tv_test)
        val tvQuestion=findViewById<TextView>(R.id.tv_question)
        val btnext=findViewById<Button>(R.id.bt_next)
        val tvkolichestvo=findViewById<TextView>(R.id.tv_kolichestvo)
        var count=0

        rbvariant1.setOnClickListener {
            Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
            tvkolichestvo.text=("1/10")
        }
        rbvariant2.setOnClickListener {
            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
        }
        rbvariant3.setOnClickListener {
            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
        }
        rbvariant4.setOnClickListener {
            Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
        }
        btnext.setOnClickListener {
            count++
            tvkolichestvo.text=("${count.toString()}/10")
            if (count==10){
                count=0
            }
            rbvariant1.setOnClickListener {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
            }
            rbvariant2.setOnClickListener {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
            }
            rbvariant3.setOnClickListener {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
            }
            rbvariant4.setOnClickListener {
                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                tvkolichestvo.text=("2/10")
            }
            tvQuestion.text="2. Переведите данное слово  ,, كتاب ,, на русский язык."
            rbvariant1.text="Ручка"
            rbvariant2.text="Тетрадь"
            rbvariant3.text="Карандаш"
            rbvariant4.text="Книга"

        btnext.setOnClickListener {
            rbvariant1.setOnClickListener {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
            }
            rbvariant2.setOnClickListener {
                Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                tvkolichestvo.text=("3/10")
            }
            rbvariant3.setOnClickListener {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
            }
            rbvariant4.setOnClickListener {
                Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
            }
            tvQuestion.text="3. Переведите данное слово  ,, كن متفاجئا ,, на русский язык."
            rbvariant1.text="Смеятся"
            rbvariant2.text="Удивлятся"
            rbvariant3.text="Радоватся"
            rbvariant4.text="Плакать"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("4/10")
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                tvQuestion.text="4. Переведите данное слово  ,, تفاحة ,, на русский язык."
                rbvariant1.text="Яблоко"
                rbvariant2.text="Груша"
                rbvariant3.text="Виноград"
                rbvariant4.text="Ананас"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("5/10")
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                tvQuestion.text="5. Переведите данное слово  ,, قمر ,, на русский язык."
                rbvariant1.text="Солнце"
                rbvariant2.text="Луна"
                rbvariant3.text="Земля"
                rbvariant4.text="Марс"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("6/10")
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                tvQuestion.text="6. Ответьте на вопрос: ما اسم الملاك الذي نقل الله بواسطته القرآن على النبي محمد (صلى الله عليه وسلم)؟"
                rbvariant1.text="جبريل عليه السلام"
                rbvariant2.text="عزرائيل عليه السلام"
                rbvariant3.text="إسرافيل عليه السلام"
                rbvariant4.text="ميكائيل عليه السلام"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("7/10")
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                tvQuestion.text="7. Ответьте на вопрос: ما هو اسم آخر نبي؟"
                rbvariant1.text="اسماعيل عليه السلام"
                rbvariant2.text="موسى عليه السلام"
                rbvariant3.text="إبراهيم عليه السلام"
                rbvariant4.text="محمد صلي الله عليه وسلم"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("8/10")
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                tvQuestion.text="8. Ответьте на вопрос: من كان أول نبي؟"
                rbvariant1.text="اسماعيل عليه السلام"
                rbvariant2.text="موسى عليه السلام"
                rbvariant3.text="آدم عليه السلام"
                rbvariant4.text="إبراهيم عليه السلام"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("9/10")
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                tvQuestion.text="9. Ответьте на вопрос: في أي شهر نزل القرآن؟"
                rbvariant1.text="يناير"
                rbvariant2.text="رمضان"
                rbvariant3.text="ديسمبر"
                rbvariant4.text="سبتمبر"

            btnext.setOnClickListener {
                rbvariant1.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant2.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant3.setOnClickListener {
                    Toast.makeText(this, "Неверно!", Toast.LENGTH_SHORT).show()
                }
                rbvariant4.setOnClickListener {
                    Toast.makeText(this, "Верно!", Toast.LENGTH_SHORT).show()
                    tvkolichestvo.text=("10/10")
                }
                tvQuestion.text="10. Ответьте на вопрос: كم عدد السور في القرآن؟"
                rbvariant1.text="115"
                rbvariant2.text="132"
                rbvariant3.text="113"
                rbvariant4.text="114"




            }
            }
            }
            }
            }
            }
            }
        }

        }



    }

}