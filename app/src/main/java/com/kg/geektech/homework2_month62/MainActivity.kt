package com.kg.geektech.homework2_month62

import android.os.Bundle
import android.webkit.URLUtil.isHttpsUrl
import android.webkit.URLUtil.isValidUrl
import androidx.appcompat.app.AppCompatActivity
import com.kg.geektech.homework2_month62.databinding.ActivityMainBinding
import com.kg.geektech.homework2_month62.extensions.loadImg
import com.kg.geektech.homework2_month62.extensions.showToast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val addUrlImage = arrayListOf(
            "https://www.davno.ru/assets/images/cards/big/phrase-28.jpg",
            "https://sb.kaleidousercontent.com/67418/800x533/c5b0716f3d/animals-0b6addc448f4ace0792ba4023cf06ede8efa67b15e748796ef7765ddeb45a6fb.jpg",
            "https://img.freepik.com/free-photo/croissants-on-a-wooden-cutting-board_1150-28485.jpg?size=626&ext=jpg",
            "https://assets.ey.com/content/dam/ey-sites/ey-com/ru_kz/topics/climate-change/ey-field-with-windmills.jpg.rendition.450.300.jpg",
            "https://nrg-tk.ru/upload/iblock/15b/15b59dcbbf29a6e6bb59c66258315767.jpg",
            "https://nrg-tk.ru/upload/iblock/23b/23b9045b0c87bf97d151884b35f092aa.jpg",
            "https://i.pinimg.com/564x/b2/1f/d8/b21fd8b1e96561b298542454790e3fa2.jpg",
            "https://w7.pngwing.com/pngs/28/865/png-transparent-graphy-4-pics-1-word-mask-theatre-mask-photography-gold-metal.png",
            "https://upload.wikimedia.org/wikipedia/ru/thumb/3/3f/%D0%93%D1%83%D0%B1%D0%BA%D0%B0_%D0%91%D0%BE%D0%B1_%D0%BF%D0%B5%D1%80%D1%81%D0%BE%D0%BD%D0%B0%D0%B6.png/778px-%D0%93%D1%83%D0%B1%D0%BA%D0%B0_%D0%91%D0%BE%D0%B1_%D0%BF%D0%B5%D1%80%D1%81%D0%BE%D0%BD%D0%B0%D0%B6.png",
            "https://png.pngtree.com/png-clipart/20220208/ourmid/pngtree-3d-icon-of-rocket-for-startup-business-and-bitcoins-advertise-png-image_4381459.png"
        )

        binding.btnRandom.setOnClickListener {
            showToast("Загрузка")
            val randomImage = Random.nextInt(addUrlImage.size)
            val randomImages = addUrlImage[randomImage]
            binding.ivImageRandom.loadImg(randomImages)
        }

        binding.btnSubmit.setOnClickListener {
            if (isHttpsUrl(binding.etEnterLink.text.toString()) || isHttpsUrl(binding.etEnterLink.text.toString())
                && isValidUrl(binding.etEnterLink.text.toString())
            ) {
                binding.ivImageRandom.loadImg(binding.etEnterLink.text.toString())
            } else {
                showToast("Ссылка не верная")
            }
        }
    }
}
