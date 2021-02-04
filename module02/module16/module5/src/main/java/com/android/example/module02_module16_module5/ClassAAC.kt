package com.android.example.module02_module16_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module353_module5.ClassAAG = com.android.example.module06_module353_module5.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module02_module37_module13_module1.ClassAAG = com.android.example.module02_module37_module13_module1.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module353_module5.ClassAAD,
		param1: com.android.example.module06_module353_module5.ClassAAE,
		param2: com.android.example.module02_module37_module13_module1.ClassAAF
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
				local_var_4_0.method0("SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_3: com.android.example.module06_module353_module3.ClassAAG = com.android.example.module06_module353_module3.ClassAAG()
		local_var_2_3.method3(com.android.example.module06_module353_module2.ClassAAE())

		val local_var_2_4: com.android.example.module06_module353_module3.ClassAAI = com.android.example.module06_module353_module3.ClassAAI()
		local_var_2_4.method2(rx.observers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module02_module37_module13_module1.ClassAAC,
		param1: com.android.example.module06_module353_module5.ClassAAF,
		param2: com.android.example.module06_module353_module5.ClassAAA,
		param3: com.android.example.module06_module353_module1.ClassAAB
	) {
		param0.method1("SomeString", "SomeString")

		val local_var_2_4: com.android.example.module06_module353_module2.ClassAAD = com.android.example.module06_module353_module2.ClassAAD()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module06_module353_module3.ClassAAB = com.android.example.module06_module353_module3.ClassAAB()
		local_var_2_5.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.disposables.SerialDisposable(), io.reactivex.subscribers.TestSubscriber(), com.android.example.module06_module353_module2.ClassAAE())

	}
}
