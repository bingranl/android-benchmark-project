package com.android.example.module02_module37_module27_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module02_module37_module27_module3.ClassAAA = com.android.example.module02_module37_module27_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module02_module37_module27_module3.ClassAAH = com.android.example.module02_module37_module27_module3.ClassAAH()

	fun method0(
		param0: com.android.example.module02_module37_module27_module3.ClassAAF,
		param1: com.android.example.module02_module37_module27_module1.ClassAAI,
		param2: com.android.example.module02_module37_module27_module3.ClassAAB,
		param3: com.android.example.module02_module37_module27_module1.ClassAAH
	) {
		for (iAb in 0..3) {
			if (kotlin.Any().equals(kotlin.Any())) {
				listOf("1", "2", "3").forEach {
					val local_var_5_0: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
					local_var_5_0.offer(kotlin.Any(), kotlin.Any())

				}
			} else {
				param0.method2("SomeString", "SomeString")

			}
			val local_var_3_0: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
			local_var_3_0.assertNotSubscribed()

			local_var_3_0.dispose()

		}
	}

	fun method1(
		param0: com.android.example.module02_module37_module27_module3.ClassAAJ,
		param1: com.android.example.module02_module37_module27_module1.ClassAAC
	) {
		val local_var_2_2: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_2.offer(kotlin.Any())

		val local_var_2_3: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_3.clear()

		val local_var_2_4: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_4.offer(kotlin.Any(), kotlin.Any())

		val local_var_2_5: io.reactivex.schedulers.TestScheduler = io.reactivex.schedulers.TestScheduler()
		local_var_2_5.createWorker()

	}

	fun method2(
		param0: com.android.example.module02_module37_module27_module1.ClassAAF
	) {
		param0.method1(com.android.example.module02_module37_module27_module3.ClassAAH(), com.android.example.module02_module37_module27_module3.ClassAAA(), com.android.example.module02_module37_module27_module3.ClassAAF())

		param0.method3(com.android.example.module02_module37_module27_module3.ClassAAD(), com.android.example.module02_module37_module27_module3.ClassAAE())

		param0.method3(com.android.example.module02_module37_module27_module3.ClassAAD(), com.android.example.module02_module37_module27_module3.ClassAAE())

		val local_var_2_1: io.reactivex.internal.queue.MpscLinkedQueue<kotlin.Any> = io.reactivex.internal.queue.MpscLinkedQueue()
		local_var_2_1.offer(kotlin.Any())

	}
}
