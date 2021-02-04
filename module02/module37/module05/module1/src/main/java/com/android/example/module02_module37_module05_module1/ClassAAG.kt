package com.android.example.module02_module37_module05_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module02_module37_module05_module3.ClassAAG = com.android.example.module02_module37_module05_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module02_module37_module05_module3.ClassAAE = com.android.example.module02_module37_module05_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module02_module37_module05_module3.ClassAAA,
		param1: com.android.example.module02_module37_module05_module3.ClassAAH,
		param2: com.android.example.module02_module37_module05_module3.ClassAAJ
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.isCancelled()

	}

	fun method1(
		param0: com.android.example.module02_module37_module05_module3.ClassAAF,
		param1: com.android.example.module02_module37_module05_module3.ClassAAC,
		param2: com.android.example.module02_module37_module05_module3.ClassAAB
	) {
	}

	fun method2(
		param0: com.android.example.module02_module37_module05_module3.ClassAAG,
		param1: com.android.example.module02_module37_module05_module3.ClassAAC,
		param2: com.android.example.module02_module37_module05_module3.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
				local_var_4_0.createWorker()

			}
		}
		param0.method1("SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module02_module37_module05_module3.ClassAAE,
		param1: com.android.example.module02_module37_module05_module3.ClassAAD,
		param2: com.android.example.module02_module37_module05_module3.ClassAAA
	) {
		param0.method3("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onComplete()

	}

	fun method4(
		param0: com.android.example.module02_module37_module05_module3.ClassAAF,
		param1: com.android.example.module02_module37_module05_module3.ClassAAG
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.cancel()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.requestMore(-237393520612661165)

	}
}
